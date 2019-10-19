import java.util.*;
//generics class anc also be access without typesafe in this case heterogenous recird can be stored
class A
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add(11);
		list.add("mohan");
		list.add(3.234);
		list.add('A');
		list.add(new Object());
		System.out.println(list);
	}
}