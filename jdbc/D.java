import java.sql.*;
class D
{
	public static void main(String[] args)throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");
		String query="select user_id,username,email,password from users";
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+"\t"+rs.getString(4)+"\n");
		}
		con.close();
		
	}
}