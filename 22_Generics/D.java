import java.util.*;
class D
{
	public static void main(String[] args){
		
		ArrayList <Integer>list = new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		Integer i = list.set(1,44);
		System.out.println(i);
	}
}