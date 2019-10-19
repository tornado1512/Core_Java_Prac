//duplicate key are not allowed
import java.util.HashMap;
class H
{
	public static void main(String[] args){
		HashMap map = new HashMap();
		map.put("mohan",12);
		map.put("nohan",12);
		map.put("rohan",12);
		map.put("yohan",12);
		map.put("sohan",12);
		map.put("mohan",12);
		System.out.println(map);

	}
}