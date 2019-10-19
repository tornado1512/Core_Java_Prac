
class Student 
{
	String name;
	int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
}
class A
{
	public static void main(String[] args){
	
		Student s1 = new Student("mohan",21);
		Student s2= new Student("sohan",31);
		set.add(s1);
		set.add(s2);
		System.out.println(s1.equals(s2));
	}
}