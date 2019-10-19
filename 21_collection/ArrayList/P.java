import java.util.ArrayList;
class Student
{
	String name;
	int age;

	Student(String name,int age){
		this.name=name;
		this.age=age;
	}


}
class P
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add(new Student("Mohan",21));
		list.add(new Student("gohan",61));
		list.add(new Student("wohan",31));
		list.add(new Student("lohan",51));
		list.add(new Student("tohan",81));

		
		System.out.println(list);
	}
}