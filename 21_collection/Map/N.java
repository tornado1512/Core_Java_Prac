import java.util.TreeMap;
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
class N
{	

	public static void main(String[] args){
		System.out.println("Enter  1 for NS, 2 for AS, 3 for NRS and 4 for ARS:");
		Console inp= System.console();
		String str=inp.readLine();
		int t = Integer.parseInt(str);
		System.out.println("Enter  1 for NS, 2 for AS, 3 for NRS and 4 for ARS:");
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
		TreeMap map = new TreeMap(c);
		map.put(new Student("mohan",21),"GGITS");
		map.put(new Student("sohan",22),"GGCT");
		map.put(new Student("rohan",23),"Hitkarni");
		map.put(new Student("yohan",24),"Gloabl");
		map.put(new Student("vohan",25),"shreram");
		map.put(new Student("zohan",26),"xyz");
		map.put(new Student("mohan",21),"GGITS");
		System.out.println(map);
		
		}
}