import java.util.ArrayList;
import java.util.Collections;
class E
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add(21);
		list.add(2);
		list.add(29);
		list.add(34);
		list.add(1);
		list.add(4);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list,29));//why it is said that list is sorted
		System.out.println(Collections.binarySearch(list,234));//why it is said that list is sorted
		


	}
}