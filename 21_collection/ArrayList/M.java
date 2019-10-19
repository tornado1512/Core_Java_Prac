import java.util.*;
class M
{
	public static void main (String[] args){
		ArrayList list = new ArrayList();

			list.add("mohan");
			list.add("sohan");
			list.add("zohan");
			list.add("tohan");
			list.add("dohan");
			
			for(Object s: list){
					System.out.println(s);
			}

			/*
			for( String s : list )//doubt
				System.out.println(s);
			*/
		}
}