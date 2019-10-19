import java.util.HashMap;
class A
{
	public static void main(String[] args){
		HashMap map = new HashMap();
		map.put("mohan",21);
		map.put("sohan",2);
		map.put("gohan",4);
		map.put("johan",12);
		map.put("yohan",11);
		map.put("uohan",11);.//duplicates values are allowed
		map.put("mohan",6);//duplicates key are not allowed
		System.out.println(map);
		}
}