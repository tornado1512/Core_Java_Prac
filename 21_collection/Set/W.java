import java.util.TreeSet;

class W
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
		//System.out.println(set.first());
		//System.out.println(set.last());
		//System.out.println(set.headSet(31));
		//System.out.println(set.tailSet(21));
		//System.out.println(set.tailSet(24	));
		//System.out.println(set.subSet(21,31));
		//System.out.println(set.headSet(31,true));
		//System.out.println(set.headSet(31,false));
		System.out.println(set.tailSet(31,false));
		System.out.println(set.tailSet(31,true));
		
	}

}