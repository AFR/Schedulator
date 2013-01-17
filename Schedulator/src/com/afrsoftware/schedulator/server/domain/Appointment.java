package com.afrsoftware.schedulator.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Appointment {
	
	private Long appointmentNumber;
	private String responsible;
	private String description;
	private Date startTime;
	private int duration;
	private int places;
	private int weekNumber;
	private List<String> subscribers = new ArrayList<String>();
	
	public Appointment() {
		super();
	}
	
	public Appointment(Long appointmentNumber, String responsible,
			String description, Date startTime, int duration, int places,
			int weekNumber, List<String> subscribers) {
		super();
		this.appointmentNumber = appointmentNumber;
		this.responsible = responsible;
		this.description = description;
		this.startTime = startTime;
		this.duration = duration;
		this.places = places;
		this.weekNumber = weekNumber;
		this.subscribers = subscribers;
	}
	
	public Long getAppointmentNumber() {
		return appointmentNumber;
	}
	
	public void setAppointmentNumber(Long appointmentNumber) {
		this.appointmentNumber = appointmentNumber;
	}
	
	public String getResponsible() {
		return responsible;
	}
	
	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getStartTime() {
		return startTime;
	}
	
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public int getPlaces() {
		return places;
	}
	
	public void setPlaces(int places) {
		this.places = places;
	}
	
	public int getWeekNumber() {
		return weekNumber;
	}
	
	public void setWeekNumber(int weekNumber) {
		this.weekNumber = weekNumber;
	}
	
	public List<String> getSubscribers() {
		return subscribers;
	}
	
	public void setSubscribers(List<String> subscribers) {
		this.subscribers = subscribers;
	}

	
}
