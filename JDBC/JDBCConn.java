import java.sql.*;

public class JDBCConn 
{

	public static void main(String[] args){
		try 
		{
			//Registering Mysql Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Creating connection
			//Name of API - Type Of Database - Name Of Server:PORT - Name of Database - Name Of User - Password
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcConn","root","");

			//Creating statement for executing queries
			Statement stmt = conn.createStatement();
			System.out.println("Database Working");
			
			String sql = "CREATE table IF NOT EXISTS STUDENT(roll int(3) primary key,name varchar(15) not null);";
			stmt.executeUpdate(sql);
			
			System.out.println("Databse Created");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}