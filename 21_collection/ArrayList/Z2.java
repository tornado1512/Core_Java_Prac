import java.util.ArrayList;
import java.util.Iterator;
class Z2
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add(12);
		list.add(2.45);
		list.add("mohan");
		list.add(new A());
		System.out.println(list);

		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}
}