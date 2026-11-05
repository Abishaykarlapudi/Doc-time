package com.edugig.doctime.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "doctor_details")
@Setter
@Getter
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer doctor_id;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "userId")
	Integer user_id;

	@ManyToOne
	@JoinColumn(name = "hospital_id", referencedColumnName = "hospital_id")
	Integer hospital_id;

	@Column(nullable = false)
	String specialization;

	@Column(nullable = false)
	Double consultation_fee;

}
