package com.edugig.doctime.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "hospital_details")
@Setter
@Getter
public class Hospitals {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer hospital_id;

	@Column(nullable = false)
	String hospital_name;

	@Column(nullable = false)
	String hospital_address;

	@Column(nullable = false)
	Long hospital_phone;

	Integer admin_user_id;

}
