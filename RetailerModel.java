package org.medicinepharma.admin.model;

public class RetailerModel {
	private int retId;
	private String retName;
	private String contact;
	private String address;

	public int getRetId() {
		return retId;
	}

	public void setRetId(int retId) {
		this.retId = retId;
	}

	public String getRetName() {
		return retName;
	}

	public void setRetName(String retName) {
		this.retName = retName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String email;
}
