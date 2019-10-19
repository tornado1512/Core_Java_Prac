import java.util.*;
class J
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
			
			list.add("mohan");
			list.add("sohan");
			list.add("zohan");
			list.add("tohan");
			list.add("dohan");

			System.out.println(list);
			
			//System.out.println(list.add(2,33));
			list.add(2,"eohan");
			System.out.println(list.set(4,"eohan"));
			
			System.out.println(list);


	}
}