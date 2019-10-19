import java.sql.*;
class E
{
	public static void main(String[] args)throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");
		String query="select * from users";

		PreparedStatement pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt("user_id")+"\t"+rs.getString("username")+"\t"+rs.getString("email")+rs.getString("password"));
		}
		con.close();
	}
}