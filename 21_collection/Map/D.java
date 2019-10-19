import java.util.HashMap;
class D
{
	public static void main(String[] args){
		HashMap map = new HashMap();
		map.put("mohan",2);
		map.put("sohan",22);
		map.put("kohan",24);
		map.put("qohan",29);
		map.put("Zohan",25);
		map.put("xohan",23);

		System.out.println(map);
		System.out.println(map.remove("mohan"));
		System.out.println(map.remove("eohan"));//returns null
	}
}