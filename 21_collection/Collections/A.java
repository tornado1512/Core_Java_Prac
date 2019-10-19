import java.util.ArrayList;
import java.util.Collections;
class A
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add(11);
		list.add(21);
		list.add(9);
		list.add(3);
		list.add(1);
		list.add(12);
		list.add(10);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}
}