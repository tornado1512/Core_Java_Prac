import java.util.LinkedHashMap;
class K
{
	public static void main(String[] args){
		LinkedHashMap map = new LinkedHashMap();
		map.put("mohan",21);
		map.put("mohan",22);
		map.put("sohan",null);
		map.put("rohan",21);
		map.put("yohan",21);
		System.out.println(map);
	}
}