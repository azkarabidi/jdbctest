package jdbctest;
import java.sql.*;

public class connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			String URL = "jdbc:mysql://localhost:3306/jdbctest";
//			String USER = "root";
//			String PASS = "";
//			Connection conn = DriverManager.getConnection(URL, USER, PASS);
////			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest","root","");
//		
//			
//			
////		Statement my =conn.createStatement();
////		
////		ResultSet result =my.executeQuery("select * from huh");
////		
////		while(result.next()) {
////			System.out.println(result.getString("test"));
////		}
//			System.out.println("connected successfully");
//		
//		}catch(Exception exc){
//			
//		}
		
		try{  
//			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/jdbctest?useTimezone=true&serverTimezone=UTC","root","");  
			//here sonoo is database name, root is username and password  
			System.out.println("Connection Successfull\n");
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from huh");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}
			
	}

}
