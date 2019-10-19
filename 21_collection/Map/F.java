import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
class F
{
	public static void main(String[] args){	
		HashMap map = new HashMap();
		map.put("moham",2);
		map.put("soham",22);
		map.put("aoham",21);
		map.put("foham",25);
		map.put("coham",22);
		map.put("mXham",27);
		map.put("ioham",22);
		
		Set set = map.keySet();
		Iterator<String> str = set.iterator();
		while(str.hasNext()){//whyinfine loop
			System.out.println(map.get(str.next()));
		}

		
	}
}