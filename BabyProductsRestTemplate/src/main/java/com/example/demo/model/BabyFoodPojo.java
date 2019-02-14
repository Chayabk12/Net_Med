package com.example.demo.model;

import java.time.LocalDate;

public class BabyFoodPojo {
    String bpname;
	int bpcost;
	String bpdescription;
	String bpquantity;
	LocalDate bpmanufactureDate;
	LocalDate bpexpiryDate;
	String bphighlights;

	public String getBpname() {
		return bpname;
	}

	public void setBpname(String bpname) {
		this.bpname = bpname;
	}

	public int getBpcost() {
		return bpcost;
	}

	public void setBpcost(int bpcost) {
		this.bpcost = bpcost;
	}

	public String getBpdescription() {
		return bpdescription;
	}

	public void setBpdescription(String bpdescription) {
		this.bpdescription = bpdescription;
	}

	public String getBpquantity() {
		return bpquantity;
	}

	public void setBpquantity(String bpquantity) {
		this.bpquantity = bpquantity;
	}

	public LocalDate getBpmanufactureDate() {
		return bpmanufactureDate;
	}

	public void setBpmanufactureDate(LocalDate bpmanufactureDate) {
		this.bpmanufactureDate = bpmanufactureDate;
	}

	public LocalDate getBpexpiryDate() {
		return bpexpiryDate;
	}

	public void setBpexpiryDate(LocalDate bpexpiryDate) {
		this.bpexpiryDate = bpexpiryDate;
	}

	public String getBphighlights() {
		return bphighlights;
	}

	public void setBphighlights(String bphighlights) {
		this.bphighlights = bphighlights;
	}

}
