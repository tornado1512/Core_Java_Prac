import  java.sql.*;
import java.io.*;
class I
{
	public static void main(String[] args){
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","1234");
			String query="ins
			ert into users (username,email,password) value(?,?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			Console c=System.console();
			System.out.print("Enter username:");
			String uname=c.readLine();
			System.out.print("Enter email");
			String email=c.readLine();
			System.out.print("Enter password:");
			char[] p=c.readPassword();
			String passw=new String(p);

			pst.setString(1,uname);
			pst.setString(2,email);
			pst.setString(3,passw);

			pst.executeUpdate();
		}
		catch (ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
		}

	}
}