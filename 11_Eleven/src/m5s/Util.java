package m5s;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
	
	static Connection connection = null;
	static Statement statement = null;
	static ResultSet resultSet = null;
	
	static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			
			String url= "jdbc:mysql://localhost:3306/fcbayernplayers";
			String userName= "root";
			String passWord = "1234";
			
			connection = DriverManager.getConnection(url, userName, passWord);
			
			String sqlSelectQuery = "Select * from players";				
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlSelectQuery);
			
			while (resultSet.next()){
				String lastName = resultSet.getString(1);
				String firstName = resultSet.getString(2);
				Integer shirtNumber = resultSet.getInt(3);
				
				System.out.println(lastName + "\t"+ firstName + "\t" + shirtNumber);
				
			}
				
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		 catch (SQLException se) {
			se.printStackTrace();
		}
	}

}
