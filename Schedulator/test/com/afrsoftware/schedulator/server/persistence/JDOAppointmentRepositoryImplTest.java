package com.afrsoftware.schedulator.server.persistence;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import org.junit.*;

import com.afrsoftware.schedulator.server.domain.Appointment;

public class JDOAppointmentRepositoryImplTest {
	
	private static final Long AN_APPOINTMENT_NUMBER = 12345L;
	private JDOAppointmentRepositoryImpl service;
	private Appointment appointment;
	private PersistenceManager mockedPm;
	private PersistenceManagerFactory mockedPMF;
	
	@Before
	public void setUp(){
		service = new JDOAppointmentRepositoryImpl();
		appointment = new Appointment();
		appointment.setAppointmentNumber(AN_APPOINTMENT_NUMBER);
		
		mockedPm = mock(PersistenceManager.class);
		mockedPMF = mock(PersistenceManagerFactory.class);
		when(mockedPMF.getPersistenceManager()).thenReturn(mockedPm);
	}

	@Test
	public void canSaveAnAppointment() {
		// given
		service.setPMF(mockedPMF);

		// when
		service.saveAppointment(appointment);

		// then
		verify(mockedPMF).getPersistenceManager();
		verify(mockedPm).makePersistent(appointment);
		verify(mockedPm).close();
	}
	
	@Test
	public void canFindAnAppointmentByAppointmentNumber(){
		service.setPMF(mockedPMF);

		// when
		service.findByAppointmentNumber(AN_APPOINTMENT_NUMBER);

		// then
		verify(mockedPMF).getPersistenceManager();
		verify(mockedPm).getObjectById(Appointment.class, AN_APPOINTMENT_NUMBER);
		verify(mockedPm).detachCopy(any(Appointment.class));
		verify(mockedPm).close();
	}
	
	@Test
	public void canDeleteAnAppointment(){
		when(mockedPm.getObjectById(Appointment.class, AN_APPOINTMENT_NUMBER)).thenReturn(
				appointment);
		
		service.setPMF(mockedPMF);
		
		// when
		service.delete(appointment);
		
		// then
		verify(mockedPMF).getPersistenceManager();
		verify(mockedPm).deletePersistent(appointment);
		verify(mockedPm).close();
	}
	
	@Test
	public void canDeleteAnAppointmentByAppointmentNumber(){
		when(mockedPm.getObjectById(Appointment.class, AN_APPOINTMENT_NUMBER)).thenReturn(
				appointment);

		service.setPMF(mockedPMF);

		// when
		service.delete(AN_APPOINTMENT_NUMBER);

		// then
		verify(mockedPMF).getPersistenceManager();
		verify(mockedPm).getObjectById(Appointment.class, AN_APPOINTMENT_NUMBER);
		verify(mockedPm).deletePersistent(appointment);
		verify(mockedPm).close();
	}
	

}
