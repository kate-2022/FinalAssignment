package m5s;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//JDBC4.X autoloading feature is enabled.
public class ReadApp {

	public static void main(String[] args) throws  SQLException {

		// Step2. Establish the Connection
		String url = "jdbc:mysql:///fcbayernplayers";
		String user = "root";
		String password = "1234";
		Connection connection = DriverManager.getConnection(url, user, password);
		System.out.println("CONNECTION object created...");

		// Step3. Create statement Object and send the Query
		Statement statement = connection.createStatement();
		System.out.println("STATEMENT object created...");

		// Step4. Execute the Query and Process the resultSet
		String sqlSelectQuery = "select lastName,firstName,shirtNumber from players";
		ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
		System.out.println("RESULTSET object created...");
		System.out.println("LAST NAME\tFIRST NAME\tSHIRT NUMBER");
		while (resultSet.next()) {
			String lname = resultSet.getString("lastName");
			String fname = resultSet.getString("firstName");
			int pid = resultSet.getInt("shirtNumber");
			System.out.println(lname + "\t" + fname + "\t" + pid);
		}

		// Step6. Close the resources
		resultSet.close();
		statement.close();
		connection.close();
		System.out.println("Closing the resources...");

	}
}

