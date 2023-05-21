package m5s;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//JDBC4.X autoloading feature is enabled.
public class CreateApp {

	public static void main(String[] args) throws SQLException {

		// Step2. Establish the Connection
		String url = "jdbc:mysql:///fcbayernplayers";
		String user = "root";
		String password = "1234";
		Connection connection = DriverManager.getConnection(url, user, password);
		System.out.println("connection object created...");

		// Step3. Create statement Object and send the Query
		Statement statement = connection.createStatement();
		System.out.println("statement object created...");

		// Step4. Execute the Query and Process the resultSet
		String sqlInsertQuery = "insert into players(`lastName`,`firstName`,`shirtNumber`)values('Manjunath','Nitin',30)";
		int rowAffected = statement.executeUpdate(sqlInsertQuery);
		System.out.println("No of rows affected is :: " + rowAffected);

		// Step6. Close the resources
		statement.close();
		connection.close();
		System.out.println("closing the resources...");

	}
}
