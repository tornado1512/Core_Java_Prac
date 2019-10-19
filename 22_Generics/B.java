 import java.util.*;
class B
{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		//case3
		Iterator i = list.iterator();
		while(i.hasNext()){
			//Integer in = i.next();//complier will add (Integer)i.next()
			System.out.println(i.next());//doubt how here complier automatically toString of Integer wherees it returns Object class object


		/*//case2
		Iterator<Integer> i = list.iterator();
		while(i.hasNext()){
			Integer in = i.next();//complier will add (Integer)i.next()
			System.out.println(in);
		*/
		
		//case1
		/*
		Iterator i = list.iterator();
		while(i.hasNext()){
			Integer in = i.next();
			System.out.println(in);
			*/
		}
	}
}