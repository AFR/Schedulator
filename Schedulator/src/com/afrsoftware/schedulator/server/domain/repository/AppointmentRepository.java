package com.afrsoftware.schedulator.server.domain.repository;

import com.afrsoftware.schedulator.server.domain.Appointment;

public interface AppointmentRepository {
	
	public Appointment findByAppointmentNumber(long appointmentNumber);
	
	public void saveAppointment(Appointment appointment);
}
 