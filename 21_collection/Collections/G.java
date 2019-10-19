import java.util.*;
import java.util.Comparator;
import java.io.Console;
	
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
class NameSort implements Comparator<Student> 
{
	public int compare(Student s1,Student s2){
		return s1.name.compareTo(s2.name);
	}

}

class NameRevSort implements Comparator<Student> 
{
	public int compare(Student s1,Student s2){
		return s2.name.compareTo(s1.name);
	}

}
class AgeSort implements Comparator<Student>
{
	public int compare(Student s1,Student s2){
		return s1.age.compareTo(s2.age);
	}
}
class AgeRevSort implements Comparator<Student>
{
	public int compare(Student s1,Student s2){
		return s2.age.compareTo(s1.age);
	}
}
class G
{	

	public static void main(String[] args){
		System.out.println("Enter  1 for NS, 2 for AS, 3 for NRS and 4 for ARS:");
		Console inp= System.console();
		String str=inp.readLine();
		int t = Integer.parseInt(str);
	
			Comparator c =null;
		if(t==1){
			c= new NameSort();
		}
		if(t==2){
			c= new NameRevSort();
		}
		if(t==3){
			c= new AgeSort();
		}
		if(t==4){
			c= new AgeRevSort();
		}
			ArrayList list = new ArrayList();
		list.add(new Student("mohan",21));
		list.add(new Student("sohan",22));
		list.add(new Student("rohan",11));
		list.add(new Student("zohan",18));
		list.add(new Student("gohan",67));
		list.add(new Student("zohan",22));
		//Student s = new Student("gohan",67);
		Student s = new Student("gohan",23);
		//Student s = new Student("bohan",22);

		Collections.sort(list,c);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list,s,c));
		
		}
}
