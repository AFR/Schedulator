package com.afrsoftware.schedulator.server.persistence;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import org.junit.Test;

import com.afrsoftware.schedulator.server.domain.Appointment;

public class JDOAppointmentRepositoryImplTest {
	
	@Test
	public void canSaveAnAppointment() {
		// given
		JDOAppointmentRepositoryImpl service = new JDOAppointmentRepositoryImpl();
		Appointment appointment = new Appointment();

		PersistenceManager mockedPm = mock(PersistenceManager.class);
		PersistenceManagerFactory mockedPMF = mock(PersistenceManagerFactory.class);
		when(mockedPMF.getPersistenceManager()).thenReturn(mockedPm);

		service.setPMF(mockedPMF);

		// when
		service.saveAppointment(appointment);

		// then
		verify(mockedPMF).getPersistenceManager();
		verify(mockedPm).makePersistent(appointment);
		verify(mockedPm).close();
	}

}
