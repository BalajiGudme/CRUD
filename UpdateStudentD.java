

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class UpdateStudentD  {
	 public static void main(String[] args){

	    String url = "jdbc:mysql://localhost:3306/bstudent";
	    String user= "balaji";
	    String password = "balaji";
   //  connection
   try(Connection conn = DriverManager.getConnection(url, user, password);
      Statement stmt = conn.createStatement();
   ){
    	String sql = "update student set STUDENT_NAME='sandesh gudame',STUDENT_DOB='1998-05-09',STUDENT_DOJ='2021-02-17' where STUDENT_NO=1";
    	stmt.executeUpdate(sql);
    	 sql = "update student set STUDENT_NAME='sumit gudame',STUDENT_DOB='1978-08-15',STUDENT_DOJ='2021-02-01' where STUDENT_NO=2";
    	stmt.executeUpdate(sql);
    	 sql = "update student set STUDENT_NAME='adi gudame',STUDENT_DOB='1995-09-09',STUDENT_DOJ='2021-09-07' where STUDENT_NO=3";
    	stmt.executeUpdate(sql);
      System.out.println("Database updated successfully ");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
