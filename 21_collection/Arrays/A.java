import java.util.*;
class A
{
	public static void main(String[] args){
		/*
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(23);
		list.add(34);
		Integer [] ar = new Integer [0];
		Integer [] arr = list.toArray(ar);
		for(  Integer a:arr  )
			System.out.println(a);
		list.set(0,33);
		for(  Integer a:arr  )
			System.out.println(a);
		*/
		
		Integer [] arr={12,23,45};
		List<Integer> list=Arrays.asList(arr);//return list
		System.out.println(list);
		//case1
		//arr[0]=67;//arrayis backed by list
		//System.out.println(list);

		//case2
		//list.set(0,23);//list is backed by array
		//for(  Integer a:arr  )
		//	System.out.println(a);

		//case3
		//list.add(23);//UnsupportedOperationException
		//list.remove(21);//		

	}
}