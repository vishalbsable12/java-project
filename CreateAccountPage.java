package CreateAccount;

import Database.Connectiondatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.pojoclass.Create_Account_Pojo;

public class CreateAccountPage {
	public int insertusername(Create_Account_Pojo L) {
		int flag = 0;

		//System.out.println(L);

		try {
			Connection con = Connectiondatabase.getDBconnection();

			String sql = "insert into createaccount values(?,?,?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, L.getId());
			ps.setString(2, L.getName());
			ps.setString(3, L.getPass());
			ps.setString(4, L.getDesignation());
			ps.setString(5, L.getContact());
			ps.setString(6, L.getDOB());
			ps.setString(7, L.getEmailid());

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
