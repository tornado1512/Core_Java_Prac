class Student
{
	int age;
	String name;
	Student(String name,int age){
	this.name=name;
	this.age=age;
	}
}

class E
{
	public static void main(String[] args ){
	Student [] s = new Student[2];
	System.out.println(s);
	System.out.println(s[0]);
	System.out.println(s[1]);
	}

	

}