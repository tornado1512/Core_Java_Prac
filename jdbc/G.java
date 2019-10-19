import java.sql.*;
import java.io.*;
class G
{
	public static void main(String[] args){
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");
		String query="update users set email=? where user_id=?";
		PreparedStatement pst=con.prepareStatement(query);
		System.out.println(pst);
		Console c=System.console();
		System.out.print("Enter user_id:");
		int id=Integer.parseInt(c.readLine());
		System.out.print("Enter email:");
		String email=c.readLine();
		pst.setInt(2,id);
		pst.setString(1,email);
		System.out.println(pst);
		pst.executeUpdate();
		}
		catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
	}
}