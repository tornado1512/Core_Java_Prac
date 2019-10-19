import java.util.HashSet;
import java.util.Iterator;
class F
{
	public static void main(String [] args){
		HashSet<String> set = new HashSet<String>();

		set.add("Mohan");
		set.add("sohan");
		set.add("zohan");
		set.add("cohan");
		set.add("wohan");

		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}