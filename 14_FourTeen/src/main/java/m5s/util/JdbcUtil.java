package m5s.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtil {
	
	private JdbcUtil() {
		
	}
	
	static 
	{   // load and register the Driver
		try 
		{ 
			Class.forName("com.mysql.cj.jdbc.Driver");			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
		
	
	public static Connection getJdbcConnection() throws SQLException, IOException 
	{
		
		// get data from properties file
		FileInputStream fis = new FileInputStream("src/m5s/properties/application.properties");
		Properties properties = new Properties();
		properties.load(fis);

		// establish the connection
		Connection connection = DriverManager.getConnection(properties.getProperty("url"), 
				                                              properties.getProperty("username"), 
				                                                 properties.getProperty("password"));
		    return connection;		
	}
	
	public static void cleanUp(Connection connection, Statement statement, ResultSet resultSet) throws SQLException 
	{
		// close the resources
		if(connection!=null)
			connection.close();
		
		if(statement!=null)
			statement.close();
		
		if(resultSet!=null)
			resultSet.close();
		
	}
	
}
