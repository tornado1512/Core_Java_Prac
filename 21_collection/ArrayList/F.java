import java.util.*;
class F
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		
		list.add(12);
		list.add(19);
		list.add(3);
		list.add(2);
		list.add(1);
		System.out.println(list);				
		System.out.println(list.remove(new Integer(2)));
		System.out.println(list.remove(new Integer(12)));
		System.out.println(list.remove(new Integer(87)));
		System.out.println(list.remove(7));
		System.out.println(list);
				
	}
}