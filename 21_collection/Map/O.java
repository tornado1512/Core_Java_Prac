import java.util.TreeMap;

class O
{
	public static void main(String [] args){
		TreeMap map = new TreeMap();

		map.put("mohan",12);
		map.put("sohan",14);
		map.put("rohan",16);
		map.put("johan",19);
		map.put("yohan",21);
		map.put("vohan",13);
		map.put("zohan",24);
		map.put("gohan",34);
		System.out.println(map);
		System.out.println(map.firstKey());
		System.out.println(map.headMap("sohan"));//stricly less than key
		System.out.println(map.headMap("eohan"));//stricly less than key{}set if not found
		System.out.println(map.keySet());
		System.out.println(map.lastKey());
		System.out.println(map.tailMap("vohan"));//greater than or equal to given elemetn
		//System.out.println(map.tailMap(map.values()));

	}
}