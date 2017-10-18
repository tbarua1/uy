package com.tarkesh.oops;

//data hiding
//The fields of a class can be made read-only or write-only.
//A class can have total control over what is stored in its fields.
//The users of a class do not know how the class stores its data. A class can change the data type of a field and
//users of the class do not need to change any of their code.
public class EncapsulationTest {
	private int id;
	private String name, address, city, phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
