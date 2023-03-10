package com.pojoclass;

public class vehicleinfo 
{
	private String V_number;
	private String V_owner;
	private String model;
	private String V_contact;
	private String V_Email;
	
	public vehicleinfo(String v_number, String v_owner, String model, String v_contact, String v_Email) 
	{
		this.V_number = v_number;
		this.V_owner = v_owner;
		this.model = model;
		this.V_contact = v_contact;
		this.V_Email = v_Email;
	}
	public vehicleinfo() {
		// TODO Auto-generated constructor stub
	}
	public String getV_number() {
		return V_number;
	}
	public void setV_number(String v_number) {
		V_number = v_number;
	}
	public String getV_owner() {
		return V_owner;
	}
	public void setV_owner(String v_owner) {
		V_owner = v_owner;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getV_contact() {
		return V_contact;
	}
	public void setV_contact(String v_contact) {
		V_contact = v_contact;
	}
	public String getV_Email() {
		return V_Email;
	}
	public void setV_Email(String v_Email) {
		V_Email = v_Email;
	}
	@Override
	public String toString() {
		return "Vehicle info [Vehicle Number=\n" + V_number + ", Vehicle Owner=\n" + V_owner + ", Vehicle Model=\n" + model + ", Owner Contact="
				+ V_contact + ", Owner Email=\n" + V_Email + "]";
	}
	
	
	

}
