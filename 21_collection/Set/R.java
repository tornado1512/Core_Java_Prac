import java.util.TreeSet;
import java.util.Comparator;
import java.io.Console;
class Student
{
	String name;
	Integer age;
	Student (String name,int age){
		this.name=name;
		this.age=age;

	}
	public String toString(){
		return name+"~"+age;
	}
	
}
class NameSort implements Comparator<Student>
{
	public int compare(Student o1,Student o2){
		return o1.name.compareTo(o2.name);
	}
}
class NameRevSort implements Comparator<Student>
{
		public int compare(Student o1,Student o2 ){
			return o2.name.compareTo(o1.name);

	}

}
class AgeSort implements Comparator<Student>
{
	public int compare(Student o1,Student o2){
			return o1.age.compareTo(o2.age);
	}
}
class AgeRevSort implements Comparator<Student>
{
	public int compare(Student o1,Student o2){
			return o2.age.compareTo(o1.age);
	}
}
class S
{
	public static void main(String[] args){
		System.out.println("Enter your Choice of Sorting 1:Name 2:Reverse Name 3:: Age  4:Reverse age:");
		Console c = System.console();
		String st = c.readLine();
		int ch=Integer.parseInt(st);
		Comparator  s = null;
		if(ch==1){
			s=new NameSort();
		}
		if(ch==2){
			s=new NameRevSort();
		}if(ch==3){
			s=new AgeSort();
		}if(ch==4){
			s=new AgeRevSort();
		}
		TreeSet set= new TreeSet(s);
		set.add(new Student("mohan",21));
		set.add(new Student("sohan",22));
		set.add(new Student("fohan",20));
		set.add(new Student("vohan",23));
		set.add(new Student("zohan",29));
		set.add(new Student("gohan",31));
		System.out.println(set);

		
	}
}