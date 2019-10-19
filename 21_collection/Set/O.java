import java.util.TreeSet;
class Student
{
	String name;
	int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;

	}

}

class O
{
	public static void main(String[] args){
		TreeSet set=new TreeSet();
		set.add(new Student("mphan",32));
		set.add(new Student("sphan",32));//ClassCastException - if the specified object cannot be compared with the elements currently in this se
		set.add(new Student("vphan",32));
		set.add(new Student("aphan",32));
		set.add(new Student("sphan",32));
		set.add(new Student("zphan",32));
		System.out.println(set);

	}
}