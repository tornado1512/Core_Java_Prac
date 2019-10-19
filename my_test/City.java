
import java.sql.*;
import java.util.ArrayList;

public class City{
	private Integer cityId;
	private String city;

	public City(){

	}
	public City(Integer cityId,String city){
			this.cityId=cityId;
			this.city=city;
	}

	public static ArrayList<City> collectCities(String ct){
		ArrayList<City> cities = new ArrayList<City>();
		try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pracdb?user=root&password=1234");
				String query = "select city_id,city from cities where city like ' abc%' ";
				PreparedStatement pst = con.prepareStatement(query);
				ResultSet rs = pst.executeQuery();
				while(rs.next()){
						City c = new City();
						c.cityId = rs.getInt(1);
						System.out.println(rs.getInt(1));
						c.city = rs.getString(2);
						System.out.println(rs.getString(2));
						cities.add(c);
				}
				con.close();
		}catch(ClassNotFoundException | SQLException e){
				e.printStackTrace();
		}
		return cities;
	}

	public void setCityId(Integer cityId){
			this.cityId=cityId;
	}
	public Integer getCityId(){
		return cityId;
	}
	public void setCity(String city){
			this.city = city;
	}
	public String getCity(){
			return city;
	}
	
}

