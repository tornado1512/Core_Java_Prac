import java.util.*;
class C
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		System.out.println(list);
		//Integer i = list.set(1,34);object cannot be converted to int parent cannot be assign to child
		Integer i = (Integer)list.set(1,34);
		System.out.println(i);
	}
}