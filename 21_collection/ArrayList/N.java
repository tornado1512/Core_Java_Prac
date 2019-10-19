import java.util.*;
//use of generics
class N
{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
			list.add("Mohan");
			list.add("gohan");
			list.add("nohan");
			list.add("lohan");
			list.add("Pohan");

			for(String str:list){
				System.out.println(str);
			}
			
	}
	
}