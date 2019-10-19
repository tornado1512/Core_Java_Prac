import java.util.HashSet;
class D
{

	public static void main(String[] args){
		HashSet set = new HashSet();
		set.add("mohan");
		set.add("sohan");
		set.add("nohan");
		set.add("bohan");
		set.add("vohan");

		System.out.println(set);

		System.out.println(set.isEmpty());
		System.out.println(set.size());
		System.out.println(set.contains("mohan"));
		System.out.println(set.contains("eohan"));
		System.out.println(set.remove("sohan"));
		System.out.println(set.remove("lohan"));
		System.out.println(set);
	}
}