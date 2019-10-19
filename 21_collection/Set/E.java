import java.util.HashSet;
class E
{
	public static void main(String[] args){
		HashSet<String> set = new HashSet<String>();

		set.add("Mohan");
		set.add("sohan");
		set.add("zohan");
		set.add("cohan");
		set.add("wohan");

		for(String str:set){
			System.out.println(str);
		}
	}
}