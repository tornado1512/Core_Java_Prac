import java.util.TreeSet;

class Student 
{
	String name;
	int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public int compareTo(Object obj){
		Student s1=this;
		Student s2=(Student)obj;
		String nm1=s1.name;
		String nm2=s2.name;
		return s1.compareTo(s2);
	}
}
class P
{
	public static void main(String[] args){
		TreeSet set=new TreeSet();
		set.add(new Student("mohan",21));
		set.add(new Student("sohan",41));
		set.add(new Student("tohan",31));
		set.add(new Student("yohan",51));
		set.add(new Student("vohan",11));
		System.out.println(set);

	}
}