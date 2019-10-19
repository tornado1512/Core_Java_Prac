import java.sql.*;
import java.io.*;
class C
{
	public static void main(String[] args)throws ClassNotFoundException,SQLException{
		Class klass=Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");
		String query="insert into users (username,email,password) value(?,?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		Console c=System.console();
		System.out.print("Enter user name:");
		String uname=c.readLine();
		pst.setString(1,uname);
		System.out.print("Enter email:");
		String email=c.readLine();
		pst.setString(2,email);
		System.out.print("Enter Password:");
		char [] pswrd=c.readPassword();
		String psw=new String(pswrd);
		pst.setString(3,psw);

		pst.executeUpdate();
		con.close();
	}
}