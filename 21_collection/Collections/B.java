import java.util.ArrayList;
import java.util.Collections;
class Student
{
	String name;
	Integer age;
	Student (String name,Integer age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return name+"~"+age;
	}
}
class B
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add(new Student("mohan",21));
		list.add(new Student("sohan",11));
		list.add(new Student("rohan",23));
		list.add(new Student("yohan",28));
		list.add(new Student("gohan",15));
		list.add(new Student("rohan",22));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
