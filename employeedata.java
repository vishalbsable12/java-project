package DISPLAYDATA;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import Database.Connectiondatabase;

public class employeedata 
{
	public int empshow() throws SQLException {

		Connection con = Connectiondatabase.getDBconnection();

		String sql = "select * from employee";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println("EMPLOYEE ID : "+rs.getInt(1));
			System.out.println("EMPLOYEE NAME : "+rs.getString(2));
			System.out.println("DESIGNATION : "+rs.getString(3));
			System.out.println("DOB : "+rs.getString(4));
			System.out.println("CONTACT NUMBER : "+rs.getString(5));
			System.out.println("EMAIL ID : "+rs.getString(6));
			System.out.println("CITY : "+rs.getString(7));
			System.out.println("SALARY : "+rs.getString(8));
			System.out.println("-----------------------------------");

		}
		rs.close();
		return 0;
	}

}
