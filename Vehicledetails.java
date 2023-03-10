package vehicledetails;

import Database.Connectiondatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.pojoclass.vehicleinfo;

public class Vehicledetails {

	public int insertVehicle(vehicleinfo v) {
		int flag = 0;
		System.out.println(v);
		try {
			Connection con = Connectiondatabase.getDBconnection();

			String sql = "insert into vehicle values(?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, v.getV_number());
			ps.setString(2, v.getV_owner());
			ps.setString(3, v.getModel());
			ps.setString(4, v.getV_contact());
			ps.setString(5, v.getV_Email());

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
