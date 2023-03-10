package DISPLAYDATA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Database.Connectiondatabase;

public class vehicledata 
{
	public int vehicleshow() throws SQLException {

		Connection con = Connectiondatabase.getDBconnection();

		String sql = "select * from vehicle";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println("VEHICLE NUMBER : "+rs.getString(1));
			System.out.println("OWNER NAME :"+rs.getString(2));
			System.out.println("VEHECLE MODEL YEAR : "+rs.getString(3));
			System.out.println("OWNER CONTACT NUMBER : "+rs.getString(4));
			System.out.println("OWNER EMAIL ID : "+rs.getString(5));
			System.out.println("-----------------------------------");

		}
		rs.close();
		return 0;
	}

}
