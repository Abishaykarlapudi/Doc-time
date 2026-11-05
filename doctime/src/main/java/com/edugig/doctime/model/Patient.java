package com.edugig.doctime.model;

import java.util.Date;

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
@Table(name="doctime_patient_details")
@Setter
@Getter
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer patient_id;
	@ManyToOne
	@JoinColumn(name = "user_id" , referencedColumnName = "userId")
	Integer user_id;
	@Column(nullable = true)
	Long phone;
	@Column(nullable = true)
	Date date_of_birth;
	String address;
	
}
