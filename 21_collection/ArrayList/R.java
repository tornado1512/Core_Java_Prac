import java.util.ArrayList;
class Student
{
	String name;
	int age;

	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object obj){
		Student s1 = this;
		Student s2 = (Student)obj;

		String nm1=this.name;
		String nm2= s2.name;
		System.out.println(nm1+"~"+nm2);

		return(nm1.equals(nm2));
	}


}
class R
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add(new Student("Mohan",21));
		list.add(new Student("gohan",61));
		list.add(new Student("wohan",31));
		list.add(new Student("lohan",51));
		list.add(new Student("tohan",81));

		Student s = new Student("Mohan",21);
		System.out.println(list.contains(s));//it check obj code which unique for every object
	}
}