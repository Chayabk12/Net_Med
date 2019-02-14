package com.example.demo.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("babyproductpersonal")
public class BabyPersonalPojo {

	@Id
	String personalname;
	int personalcost;
	String personaldescription;
	String personalquantity;
	LocalDate personalmanufactureDate;
	LocalDate personalexpiryDate;
	String personalhighlights;

	public String getPersonalname() {
		return personalname;
	}

	public void setPersonalname(String personalname) {
		this.personalname = personalname;
	}

	public int getPersonalcost() {
		return personalcost;
	}

	public void setPersonalcost(int personalcost) {
		this.personalcost = personalcost;
	}

	public String getPersonaldescription() {
		return personaldescription;
	}

	public void setPersonaldescription(String personaldescription) {
		this.personaldescription = personaldescription;
	}

	public String getPersonalquantity() {
		return personalquantity;
	}

	public void setPersonalquantity(String personalquantity) {
		this.personalquantity = personalquantity;
	}

	public LocalDate getPersonalmanufactureDate() {
		return personalmanufactureDate;
	}

	public void setPersonalmanufactureDate(LocalDate personalmanufactureDate) {
		this.personalmanufactureDate = personalmanufactureDate;
	}

	public LocalDate getPersonalexpiryDate() {
		return personalexpiryDate;
	}

	public void setPersonalexpiryDate(LocalDate personalexpiryDate) {
		this.personalexpiryDate = personalexpiryDate;
	}

	public String getPersonalhighlights() {
		return personalhighlights;
	}

	public void setPersonalhighlights(String personalhighlights) {
		this.personalhighlights = personalhighlights;
	}

}
