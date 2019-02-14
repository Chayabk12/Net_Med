package com.example.demo.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("babyproductnapkins")
public class BabyNapkinsPojo {
	
	@Id
	String napkinname;
	int napkincost;
	String napkindescription;
	String napkinquantity;
	LocalDate napkinmanufactureDate;
	LocalDate napkinexpiryDate;
	String napkinhighlights;

	public String getNapkinname() {
		return napkinname;
	}

	public void setNapkinname(String napkinname) {
		this.napkinname = napkinname;
	}

	public int getNapkincost() {
		return napkincost;
	}

	public void setNapkincost(int napkincost) {
		this.napkincost = napkincost;
	}

	public String getNapkindescription() {
		return napkindescription;
	}

	public void setNapkindescription(String napkindescription) {
		this.napkindescription = napkindescription;
	}

	public String getNapkinquantity() {
		return napkinquantity;
	}

	public void setNapkinquantity(String napkinquantity) {
		this.napkinquantity = napkinquantity;
	}

	public LocalDate getNapkinmanufactureDate() {
		return napkinmanufactureDate;
	}

	public void setNapkinmanufactureDate(LocalDate napkinmanufactureDate) {
		this.napkinmanufactureDate = napkinmanufactureDate;
	}

	public LocalDate getNapkinexpiryDate() {
		return napkinexpiryDate;
	}

	public void setNapkinexpiryDate(LocalDate napkinexpiryDate) {
		this.napkinexpiryDate = napkinexpiryDate;
	}

	public String getNapkinhighlights() {
		return napkinhighlights;
	}

	public void setNapkinhighlights(String napkinhighlights) {
		this.napkinhighlights = napkinhighlights;
	}

}
