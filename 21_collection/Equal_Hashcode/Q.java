import java.util.TreeSet;
import java.util.Comparator;
class Student
{
	String name;
	int age;
	Student (String name,int age){
		this.name=name;
		this.age=age;

	}
	
}
class NameSort implements Comparator
{
	public int compare(Object o1,Object b2){
		Student s1=o1;
		Student s2=o2;

		String nm1=s1.name;
		String nm2=s2.name;
		return nm1.compareTo(nm2);
	}
}

class Q
{
	public static void main(String[] args){
		NameSort s = new NameSort();
		TreeSet set= new TreeSet(s);
		System.out.println(set);
	}
}