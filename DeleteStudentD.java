



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DeleteStudentD  {
	 public static void main(String[] args){

	    String url = "jdbc:mysql://localhost:3306/bstudent";
	    String user= "balaji";
	    String password = "balaji";
   //  connection
   try(Connection conn = DriverManager.getConnection(url, user, password);
      Statement stmt = conn.createStatement();
   ){
    	String query  = "delete from student where STUDENT_NO=1";
    	stmt.executeUpdate(query );
    	query  = "delete from student where STUDENT_NO=2";
    	stmt.executeUpdate(query );
    	query  = "delete from student where STUDENT_NO=3";
    	stmt.executeUpdate(query );
      System.out.println("Database delete successfully ");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}

