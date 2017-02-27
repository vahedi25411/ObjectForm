/*
 * This java class, Address.java, is the Address java object holds all necessary information for addresses
 * 
 * id: A unique id number for the SQL database
 * house: A four digit number for the address (house number)
 * street: The name street of the address
 * area: 
 * city: The city of the address as a string
 * pin: The zip code of the address as an Integer object
 * state: The state of the address as a string
 * country: The country of the address as a string
 */

package com.object.form.model;

import java.io.Serializable;

@Entity
@table(name="Address")
public class Address implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private String id;
	
	@Column(name="HOUSE")
	private String house;
	
	@Column(name="STREET")
	private String street;
	
	@Column(name="AREA")
	private String area;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="PIN")
	private Integer pin;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="COUNTRY")
	private String country;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}	
}
