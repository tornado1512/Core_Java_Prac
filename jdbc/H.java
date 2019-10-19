import java.sql.*;
import java.io.*;
class H
{
	public static void main(String[] args){
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");
		String query="delete from users where email=?";
		PreparedStatement pst=con.prepareStatement(query);
		Console c=System.console();
		String email=c.readLine();
		pst.setString(1,email);
		pst.executeUpdate();
		con.close();
		}
		catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
	}
}