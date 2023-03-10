package loginpage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.QueryReturnType;

import CreateAccount.CreateAccountPage;
import DISPLAYDATA.CreateAccount;
import ScannerObj.ScannerClass;
import Database.Connectiondatabase;

public class LoginPage {

	public int Page_Login()
	{
		
		String contact = null;
		String password = null;
		try{
			Connection con = Connectiondatabase.getDBconnection();

			String sql = "SELECT  * FROM  createaccount where contact = ? and password = ?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1,contact);

			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next())
			{
				return 1;
			}
		}catch(
		SQLException e)
		{
			e.printStackTrace();
			e.getMessage();
			
		}
		return 0;
		
		
		
	}
	
}



