import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class GetlistAllStudent {
	 public static void main(String[] args){

	    String url = "jdbc:mysql://localhost:3306/bstudent";
	    String user= "balaji";
	    String password = "balaji";
   //  connection
   try(Connection conn = DriverManager.getConnection(url, user, password);
      Statement stmt = conn.createStatement();
   ){
    	String query ="select * from student";
    	ResultSet set=stmt.executeQuery(query );
    	   System.out.println("STUDENT_NO"+"\t"+"STUDENT_NAME"+"\t"+"STUDENT_DOB"+"\t"+"STUDENT_DOJ");
		   // result from student
		   while(set.next())
		   {
				 System.out.println(""+set.getInt("STUDENT_NO")+"\t"+set.getString("STUDENT_NAME")+"\t"+set.getString("STUDENT_DOB")+"\t"+set.getString("STUDENT_DOJ"));				
			  }
		   // close ResultSet set
		   set.close();
		
      
      
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}

