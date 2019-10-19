//arrayIndexOutOfBoundIndex
import java.util.*;
class H
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(12);
		list.add(12);
		list.add(12);
		list.add(12);
		list.add(12);
		System.out.println(list.remove(10));
	}
}