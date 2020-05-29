package mysql;
import java.sql.*;
public class Databasechk {
	
	public  static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //this is class call Class having method forname which takes driver of databse
		System.out.println("Driver loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fullform", "root","munmun86");
		//getConnection returns Connection it, shows database connected;
		
		Statement stmnt = con.createStatement();  //createStatement returns statement
		//this statement will help in executing database query
		
		String Query1= "select * from contacts";
		ResultSet rs = stmnt.executeQuery(Query1);  //IT returns Result Set
		
		while (rs.next()){
		String Fname =	rs.getString("FirstName");
		System.out.println(" first rec is " + Fname);
		}
		rs.close();
		con.close();
		stmnt.close();
	}

}
