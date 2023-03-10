package com.pojoclass;

public class employeeDetails 
{
	
	private int Id;
	private String name;
	private String Designation;
	private String DOB;
	private String contact;
	private String emailid;
	private String address;
	private String salary;
	
	
	public employeeDetails(int id, String name, String designation, String dOB, String contact, String emailid,
			String address, String salary) {
		Id = id;
		this.name = name;
		this.Designation = designation;
		this.DOB = dOB;
		this.contact = contact;
		this.emailid = emailid;
		this.address = address;
		this.salary = salary;
	}
	public employeeDetails() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee Details [Employee Id=\n" + Id + ", Name= \n" + name + ", Designation= \n" + Designation + ", DOB= \n" + DOB
				+ ", Contact= \n" + contact + ", Email Id= \n" + emailid + ", Address= \n"  + address + ", Salary= \n" + salary + "]";
	}
	
	
	
 
	
}
	