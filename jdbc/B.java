import java.sql.*;
class B
{
	public static void main(String[] args)throws ClassNotFoundException,SQLException{
		
		Class klass=Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");
		String query="insert into users (username,email,password) value(?,?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1,args[0]);
		pst.setString(2,args[1]);
		pst.setString(3,args[2]);
		pst.executeUpdate();
		con.close();
	}
}