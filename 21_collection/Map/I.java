import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
class I
{
	public static void main(String[] args){
		HashMap map = new HashMap();
		map.put("mohan",12);
		map.put("nohan",1);
		map.put("rohan",null);
		map.put("yohan",13);
		map.put("sohan",12);
		map.put(null,12);
		map.put("mohan",null);
		System.out.println(map);
		Set set = map.keySet();
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()){
			System.out.println(map.get(itr.next()));
		}
	}
}