import java.util.Hashtable;
class J
{
	public static void main(String[] args){
		Hashtable map = new Hashtable();
map.put("mohan",12);
		map.put("nohan",1);
		//map.put("rohan",null);//nullvalues are not allowed
		map.put("yohan",13);
		map.put("mohan",12);//duplicate not allowed
		//map.put("mohan",null);//nill values are not allowed
		System.out.println(map);
	}
}