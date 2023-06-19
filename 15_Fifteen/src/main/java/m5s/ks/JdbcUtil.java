package m5s.ks;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcUtil {
	
	static Connection connection = null;
	static Statement statement = null;
	static ResultSet result = null;

	static int id;
	static String address;
	static int age;
	static String name;
	

	
	protected JdbcUtil() {
			
	}
	
	static 
	{   // Step1. Load and register the Driver
		try 
		{ 
			Class.forName("com.mysql.cj.jdbc.Driver");			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
		
	
	public static Connection getJdbcConnection() throws SQLException, IOException 
	{
			// Step2. Establish the Connection
		    String url= "jdbc:mysql:///students";
			String username = "root";
			String password = "1234";
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection object created..");
			doJdbcStuff();
			return connection;
			
	}
	
	public static ResultSet doJdbcStuff() throws SQLException {
			// Step3. Create statement Object and send the Query	
			statement = connection.createStatement();
			System.out.println("Statement object created..");
			
			// Step 4/5 execute the Query and process the result
			String selectQuery = "select sid, saddress, sage, sname from student";
			ResultSet result = statement.executeQuery(selectQuery);
			System.out.println("ResultSet object created");
		
			try {
			if(result!=null) 
			{
			id = result.getInt("sid");
			address = result.getString("saddress");		
			age = result.getInt("sage");	
			name = result.getString("sname");
			System.out.println(id +"\t"+ name +"\t"+age+"\t"+address);			
			
			System.out.println("StudentID\tStudentName\tStudentAge\tStudentAddress");
			}else {
				System.out.println("No entry available!");				
			}
              		
	        }catch(SQLException se) {
	        	se.printStackTrace();
	        }
			return result;
	        }
	
	public static void cleanUp(Connection connection, Statement statement, ResultSet resultSet) throws SQLException 
	{
		// Step 6.Close the resources
		if(connection!=null)
			connection.close();
		
		if(statement!=null)
			statement.close();
		
		if(resultSet!=null)
			resultSet.close();
		
	}
	
	public static Connection getConnection() {
		return connection;
	}
	
	public static Statement getStatement() {
		return statement;
	}
	
	public static ResultSet getResult() {
		return result;
	}
	
	public static int getId() {
		return id;
	}
	
	public static String getAddress() {
		return address;
	}
	
	public static int getAge() {
		return age;
	}
	
	public static String getName() {
		return name;
	}
}


