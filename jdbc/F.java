import java.sql.*;
import java.io.*;
class F
{
	public static void main(String[] args)throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");
		String query="select *from users where user_id=?";
		PreparedStatement pst=con.prepareStatement(query);
		Console c=System.console();
		int i=Integer.parseInt(c.readLine());
		pst.setInt(1,i);
		ResultSet rs=pst.executeQuery();
		rs.next();		
		//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		System.out.println(rs.getInt("user_id")+"\t"+rs.getString("username")+"\t"+rs.getString("email")+"\t"+rs.getString("password"));
		con.close();
		}
}