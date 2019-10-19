import java.util.TreeSet;

class X
{
	public static void main(String[] args){
		TreeSet set = new TreeSet();
		set.add(21);
		set.add(11);
		set.add(31);
		set.add(2);
		set.add(43);
		set.add(26);
		System.out.println(set);
		//System.out.println(set.ceiling(31));//least greater than or equal to given element
		//System.out.println(set.ceiling(32));//least greater than or equal to given element
		//System.out.println(set.ceiling(45));//least greater than or equal to given element or null if not found
		System.out.println(set.floor(31));//greatest element in the set less than or equal to given element or null if not found
		System.out.println(set.floor(32));//greatest element in the set less than or equal to given element or null if not found
		System.out.println(set.floor(1));//or null
	
	}
}