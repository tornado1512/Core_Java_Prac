import java.util.HashMap;
class C
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
		//System.out.println(map.containsKey("mohan"));
		//System.out.println(map.containsKey("meohan"));
		System.out.println(map.containsValue(new Integer(2)));
		System.out.println(map.containsValue(2));


	}
}