import java.util.HashSet;

class Student
{
	String name;
	int age;
	Student (String name,int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object obj){
		Student s1= this;
		Student s2= (Student)obj;
		String nm1=s1.name;
		String nm2=s2.name;
		return nm1.equals(nm2);
		
	}
	public int hashCode(){
		return 12;
	}

	public String toString(){
		return name+"~"+age;
	}
}
class I
{
	public static void main(String[] args){
		HashSet set= new HashSet();
		set.add(new Student("mohan",21));
		set.add(new Student("sohan",11));
		set.add(new Student("bohan",31));
		set.add(new Student("johan",41));
		set.add(new Student("dohan",11));
		set.add(new Student("dohan",11));

		System.out.println(set);

		System.out.println(set.contains(new Student("mohan",21)));
		System.out.println(set.remove(new Student("mohan",21)));
		System.out.println(set);


	}
}