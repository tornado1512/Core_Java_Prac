import java.util.*;
class Q
{
	public static void main(String[] args){
		ArrayList b = new ArrayList();
		b.add(22);
		b.add(23);
		b.add(23);
		ArrayList<?extends Number> a = new ArrayList<Integer>();
		//a.add(22);
		//a=b;
		//a.set(1,290);
		System.out.println(a.remove(1));		
	}
}