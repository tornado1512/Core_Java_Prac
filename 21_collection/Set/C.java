import java.util.HashSet;
class C
{
	public static void main(String[] args){
		HashSet set= new HashSet();

		set.add(11);
		set.add(22);
		set.add(33);
		set.add(44);
		set.add(55);

		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());

	}
}