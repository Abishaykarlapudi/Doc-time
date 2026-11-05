package com.edugig.doctime.model;

import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "doctime_appointment_details")
@Setter
@Getter
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer appointment_id;

	@ManyToMany
	@JoinColumn(name = "patient_id", referencedColumnName = "patient_id")
	Integer patient_id;
	@ManyToMany
	@JoinColumn(name = "doctor_id", referencedColumnName = "doctor_id")
	Integer doctor_id;
	@Column(nullable = true)
	Date appointment_date;
	@Column(nullable = true)
	Time appointment_time;
	@Column(nullable = true)
	String status;
	@Column(nullable = true)
	String reason;

}
