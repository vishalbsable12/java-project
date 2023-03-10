package Employeedetails;

import Database.Connectiondatabase; 

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.pojoclass.employeeDetails;

public class employeeinfo {
	public int insertemployee(employeeDetails EMP) {
		int flag = 0;

		try {
			Connection con = Connectiondatabase.getDBconnection();

			String sql = "insert into employee values(?,?,?,?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, EMP.getId());
			ps.setString(2, EMP.getName());
			ps.setString(3, EMP.getDesignation());
			ps.setString(4, EMP.getDOB());
			ps.setString(5, EMP.getContact());
			ps.setString(6, EMP.getEmailid());
			ps.setString(7, EMP.getAddress());
			ps.setString(8, EMP.getSalary());

			flag = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (flag > 0) {
			return 1;
		} else {
			return 0;
		}

	}

}
