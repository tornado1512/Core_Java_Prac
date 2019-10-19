import java.util.*;
class L
{
	public static void main (String[] args){
		ArrayList list = new ArrayList();

			list.add("mohan");
			list.add("sohan");
			list.add("zohan");
			list.add("tohan");
			list.add("dohan");

			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));
			}
	}
}