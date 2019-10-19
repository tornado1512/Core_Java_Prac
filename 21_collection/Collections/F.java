import java.util.*;
class Student implements Comparable<Student>
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
	
	public int compareTo(Student s){
		return this.name.compareTo(s.name);
	}
	
}
class F
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add(new Student("mohan",21));
		list.add(new Student("sohan",22));
		list.add(new Student("rohan",11));
		list.add(new Student("zohan",18));
		list.add(new Student("gohan",67));
		list.add(new Student("zohan",22));
		//Collections.sort(list);//what is the use
		//case 1
		//Student s =new Student("rohan",21);
		//case2
		Student s =new Student("fohan",21);
		System.out.println(Collections.binarySearch(list,s));
			
	}
}