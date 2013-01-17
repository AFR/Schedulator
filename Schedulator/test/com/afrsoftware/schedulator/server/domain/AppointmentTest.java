package com.afrsoftware.schedulator.server.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppointmentTest {
	
	@Test
	public void canInstantiateAppointment(){
		Appointment appointment = new Appointment();
		
		assertNotNull(appointment);
	}
}
