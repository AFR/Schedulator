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
		PersistenceManager pm = getPersistenceManager();
		Appointment appointment, detachedAppointment;
		try {
			appointment = pm.getObjectById(Appointment.class, appointmentNumber);
			detachedAppointment = pm.detachCopy(appointment);
		} finally {
			pm.close();
		}
		return detachedAppointment;
	}
	
	
	@Override
	public void delete(Appointment appointment) {
		PersistenceManager pm = getPersistenceManager();
		try {
			
				//TODO refund the deleted appointment. 
				//this can also be managed in the domain, not the implementation of the repo
				//since it's refunds are domain related.

			pm.deletePersistent(appointment);
		} finally {
			pm.close();
		}
		
	}
	
	@Override
	public void delete(long appointmentNumber) {
		PersistenceManager pm = getPersistenceManager();
		Appointment appointment;
		try {
			appointment = pm.getObjectById(Appointment.class, appointmentNumber);
			
				//TODO refund the deleted appointment. 
				//this can also be managed in the domain, not the implementation of the repo
				//since it's refunds are domain related.

			pm.deletePersistent(appointment);
		} finally {
			pm.close();
		}
	}
	
	private PersistenceManager getPersistenceManager() {
		return PMF.getPersistenceManager();
	}

	//WARNING -- this method is for test only
	protected void setPMF(PersistenceManagerFactory mockedPMF) {
		this.PMF = mockedPMF;
	}


}
