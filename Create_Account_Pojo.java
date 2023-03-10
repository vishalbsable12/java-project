package com.pojoclass;

public class Create_Account_Pojo {
	private int id;
	private String name;
	private String pass;
	private String designation;
	private String contact;
	private String DOB;
	private String emailid;

	public Create_Account_Pojo(int id,String name, String pass, String designation, String contact, String dOB, String emailid) {
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.designation = designation;
		this.contact = contact;
		DOB = dOB;
		this.emailid = emailid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Create_Account_Pojo() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	@Override
	public String toString() {
		return "login_create [id=" + id + ", name=" + name + ", pass=" + pass + ", designation=" + designation
				+ ", contact=" + contact + ", DOB=" + DOB + ", emailid=" + emailid + "]";
	}
	
	


}
