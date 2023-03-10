package com.main;

import java.util.Scanner; 

//class import
import vehicledetails.Vehicledetails;
import Employeedetails.employeeinfo;
import ScannerObj.ScannerClass;
import DISPLAYDATA.employeedata;
import DISPLAYDATA.CreateAccount;
import DISPLAYDATA.vehicledata;
import loginpage.LoginPage;
import CreateAccount.CreateAccountPage;

//pojo class import
import com.pojoclass.vehicleinfo;
import com.pojoclass.employeeDetails;
import com.pojoclass.Create_Account_Pojo;

public class mainclassfile {
	public static void main(String[] args) {

		Vehicledetails vs = new Vehicledetails(); // class object
		employeeinfo Emp = new employeeinfo(); // class object
		CreateAccountPage log = new CreateAccountPage(); // class object
		LoginPage login = new LoginPage();


		employeedata empdis = new employeedata(); // display class
		CreateAccount Create = new CreateAccount(); // display class
		vehicledata vehicle = new vehicledata(); // display class

		Scanner sc = ScannerClass.getScanner();

		try {
			vehicleinfo v = new vehicleinfo(); // pojo class object
			employeeDetails ED = new employeeDetails(); // pojo class object
			Create_Account_Pojo lc = new Create_Account_Pojo(); // pojo class object

			// vehicle

			String number;
			String owner;
			String model;
			String Vcontact;
			String VEmail;

			// employee

			int Id;
			String name;
			String Designation;
			String DOB;
			String Econtact;
			String emailid;
			String address;
			String salary;
			int check;

			// login

			String Cname;
			String Cpass;
			String Cdesignation;
			String Ccontact;
			String CDOB;
			String Cemailid;

			do {
				System.out.println("\t\t\tWELCOME TO JEET_ADS_&_RESOURCE\t\t\t");
				System.out.println(" 1 : CREATE ACCOUNT");
				System.out.println(" 2 : ADD Employee ");
				System.out.println(" 3 : Add Vehicle  ");
				System.out.println(" 4 : DISPLAY LOGIN USER  ");
				System.out.println(" 5 : DISPLAY VEHICLES  ");
				System.out.println(" 6 : DISPLAY EMPLOYEES  ");
				System.out.println(" 7 : LOG-IN");
				System.out.println(" Enter Option : ");
				int op = sc.nextInt();

				switch (op) {

					case 1:
						System.out.println("\t\t\tWELCOME TO JEET_ADS_&_RESOURCE\t\t\t");
						System.out.println("\tCREATE ACCOUNT ");
						System.out.println("Enter Name :  ");
						sc.nextLine();
						Cname = sc.nextLine();
						System.out.println("Enter Create Password :  ");
						Cpass = sc.nextLine();
						System.out.println("Enter Designation :  ");
						Cdesignation = sc.nextLine();
						System.out.println("Enter DOB :  ");
						CDOB = sc.nextLine();
						System.out.println("Enter Contact :  ");
						Ccontact = sc.nextLine();
						System.out.println("Enter Email ID :  ");
						Cemailid = sc.nextLine();

						lc.setName(Cname);
						lc.setPass(Cpass);
						lc.setDesignation(Cdesignation);
						lc.setDOB(CDOB);
						lc.setEmailid(Cemailid);
						lc.setContact(Ccontact);

						String insertMsg1 = (log.insertusername(lc) == 1) ? "Inserted" : ("NOT Insetted");
						System.out.println(insertMsg1);

						break;

					case 2:

						System.out.println("Enter Employee Name : ");
						sc.nextLine();
						name = sc.nextLine();
						System.out.println("Enter Employee Designation : ");
						Designation = sc.nextLine();
						System.out.println("Enter Employee DOB : ");
						DOB = sc.nextLine();
						System.out.println("Enter Employee Contact : ");
						Econtact = sc.nextLine();
						System.out.println("Enter Employee Email ID : ");
						emailid = sc.nextLine();
						System.out.println("Enter Employee Address : ");
						address = sc.nextLine();
						System.out.println("Enter Employee Salary : ");
						salary = sc.nextLine();

						ED.setName(name);
						ED.setDesignation(Designation);
						ED.setDOB(DOB);
						ED.setContact(Econtact);
						ED.setEmailid(emailid);
						ED.setAddress(address);
						// ED.setSalary(salary);

						String insertMsg3 = (Emp.insertemployee(ED) == 1) ? "Inserted" : ("NOT Insetted");
						System.out.println(insertMsg3);

						break;

					case 3:

						System.out.println("Enter Vehicle Number : ");
						sc.nextLine();
						number = sc.nextLine();
						System.out.println("Enter Vehicle Owner Name : ");
						owner = sc.nextLine();
						System.out.println("Enter Vehicle Model Year [YYYY] : ");
						model = sc.nextLine();
						System.out.println("Enter Owner Contact : ");
						Vcontact = sc.nextLine();
						System.out.println("Enter Owner Email ID  : ");
						VEmail = sc.nextLine();

						v.setV_number(number);
						v.setV_owner(owner);
						v.setModel(model);
						v.setV_contact(Vcontact);
						v.setV_Email(VEmail);

						System.out.println("==>  " + v);
						String insertMsg2 = (vs.insertVehicle(v) == 1) ? "Inserted" : ("NOT Insertted");
						System.out.println(insertMsg2);
						break;

					case 4:
						Create.loginshow();
						break;

					case 5:

						vehicle.vehicleshow();
						break;
					case 6:

						empdis.empshow();
						break;

					case 7 :

					login.Page_Login();
					break;

				}
				System.out.println("1.To add More Details");
				check = sc.nextInt();
			} while (check == 1);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
