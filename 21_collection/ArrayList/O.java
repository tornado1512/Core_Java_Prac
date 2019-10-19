import java.util.ArrayList;
import java.util.Iterator;
class O
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
			list.add("Mohan");
			list.add("gohan");
			list.add("nohan");
			list.add("lohan");
			list.add("Pohan");

			Iterator itr = list.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}

			
			
	}
}

