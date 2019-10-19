import java.util.HashSet;
class A
{
	public static void main(String[] args){
		HashSet set= new HashSet();

		set.add(11);
		set.add(22);
		set.add(33);
		set.add(44);
		set.add(55);

		System.out.println(set);

		System.out.println(set.remove(11));
		System.out.println(set);
	}
}
