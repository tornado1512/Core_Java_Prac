//false return 
import java.util.*;

class G
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
			list.add(12);
			list.add(1);
			list.add(14);
			list.add(2);
			list.add(1);
			list.add(12);
			System.out.println(list.remove(new Integer (23)));
	}
}