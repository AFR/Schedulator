package com.afrsoftware.schedulator.server.persistence;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import com.afrsoftware.schedulator.server.domain.Appointment;
import com.afrsoftware.schedulator.server.domain.repository.AppointmentRepository;

public class JDOAppointmentRepositoryImpl implements AppointmentRepository {
	private static PersistenceManagerFactory PMF = PersistenceManagerFactorySingleton.getPMF();
	
	@Override
	public void saveAppointment(Appointment appointment) {
		PersistenceManager pm = getPersistenceManager();
		try {
			pm.makePersistent(appointment);
		} finally {
			pm.close();
		}
	}
	
	@Override
	public Appointment findByAppointmentNumber(long appointmentNumber) {
		return null;
	}
	
	private PersistenceManager getPersistenceManager() {
		return PMF.getPersistenceManager();
	}

	//WARNING -- this method is for test only
	protected void setPMF(PersistenceManagerFactory mockedPMF) {
		this.PMF = mockedPMF;
	}


}
