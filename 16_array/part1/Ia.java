class Student 
{
	int age;
	String name;
	Student(String name,int age){
			this.name=name;
			this.age=age;
	}
	
	}

class Ia
{
	
	public static void main(String[] args){
			Student s = new Student("mohan",21);
			Student s1 = new Student("sohan",20);
			Student s2 = new Student("rohan",28);
			System.out.println(s);
			System.out.println(s1);
			System.out.println(s2);
}
}