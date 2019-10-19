class Student
{
	int age;
	String name;
	Student(String name,int age){
			this.name=name;
			this.age=age;
	}
	public String toString(){
			return name+"-"+age;//here we have override the toString mehtod of parent class
	}
}
class Ib
{
	public static void main(String[] args){
			Student s = new Student("mohan",21);
			System.out.println(s);				//if refernce variable and not null then toString is called automatically
			System.out.println(s.toString());
			
	}
}