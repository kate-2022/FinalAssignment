package m5s;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

//JDBC4.X autoloading feature is enabled.
public class BatchUpdate {
	
	    private final static String url = "jdbc:postgresql://localhost/mydb";
	    private final static String user = "postgres";
	    private final static String password = "root1234";

	    public static void main(String[] args) throws Exception {
	        parameterizedBatchUpdate();
	    }

	    public static void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }
	    }

	    private static void parameterizedBatchUpdate() throws Exception{

	        String UPDATE_USERS_SQL = "update users set name = ? where id = ?;";

	        try (Connection connection = DriverManager.getConnection(url, user, password);
	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL)) {
	            connection.setAutoCommit(false);
	            
	            PrintWriter pw = new PrintWriter("file.txt");
	            
	            BufferedReader br= new BufferedReader(new FileReader("abc.txt"));
	            String line = br.readLine();
	            while (line!=null)
	            {
	            pw.println(line);
	            line=br.readLine();
	            preparedStatement.setString(1, line);
	            preparedStatement.addBatch();
	            }
	            
	            int[] updateCounts = preparedStatement.executeBatch();
	            System.out.println(Arrays.toString(updateCounts));
	            connection.commit();
	            connection.setAutoCommit(true);
	        } catch (BatchUpdateException batchUpdateException) {
	            printBatchUpdateException(batchUpdateException);
	        } catch (SQLException e) {
	            printSQLException(e);
	        }
	    }
	    
	    public static void printBatchUpdateException(BatchUpdateException b) {

	        System.err.println("----BatchUpdateException----");
	        System.err.println("SQLState:  " + b.getSQLState());
	        System.err.println("Message:  " + b.getMessage());
	        System.err.println("Vendor:  " + b.getErrorCode());
	        System.err.print("Update counts:  ");
	        int[] updateCounts = b.getUpdateCounts();

	        for (int i = 0; i < updateCounts.length; i++) {
	            System.err.print(updateCounts[i] + "   ");
	        }
	    }

}

