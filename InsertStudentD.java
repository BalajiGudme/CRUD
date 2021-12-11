


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudentD {
   
   public static void main(String[] args) {
	     String url = "jdbc:mysql://localhost:3306/bstudent";
	    String user= "balaji";
	  String password = "balaji";
      //  connection
      try(Connection conn = DriverManager.getConnection(url, user, password);
         Statement stmt = conn.createStatement();
      ) {		      
         // Execute a query
         System.out.println("Inserting records into the table...");          
         String db = "INSERT INTO student VALUES (1, 'sumit ghate', '1999-02-05', '2021-05-06')";
         stmt.executeUpdate(db);
         db = "INSERT INTO student VALUES (2, 'adi rathod', '1999-02-05', '2021-05-06')";
         stmt.executeUpdate(db);
          db = "INSERT INTO student VALUES (3, 'Balaji gudme', '1999-02-05', '2021-05-06')";
         stmt.executeUpdate(db);
         System.out.println("Inserted records into the table...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}