import java.sql.*;
class A
{
	public static void main(String[] args){
		try{
		Class klass=Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");
		String query="insert into users (username,email,password) value('Ganesh','ganesh@gmail.com','12345')";
		PreparedStatement pst=con.prepareStatement(query);
		int i =pst.executeUpdate();
		System.out.println(i);
		con.close();
		}
		catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
	}
}
