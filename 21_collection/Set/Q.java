import java.util.TreeSet;
import java.util.Comparator;
import java.io.Console;
class Student
{
	String name;
	int age;
	Student (String name,int age){
		this.name=name;
		this.age=age;

	}
	public String toString(){
		return name+"~"+age;
	}
	
}
class NameSort implements Comparator
{
	public int compare(Object o1,Object o2){
		Student s1=(Student)o1;
		Student s2=(Student)o2;

		String nm1=s1.name;
		String nm2=s2.name;
		return nm1.compareTo(nm2);
	}
}
class NameRevSort implements Comparator
{
		public int compare(Object o1,Object o2 ){
			Student s1=(Student)o1;
			Student s2=(Student)o2;
			String nm1=s1.name;
			String nm2=s2.name;
			return nm2.compareTo(nm1);

	}

}
class AgeSort implements Comparator
{
	public int compare(Object o1,Object o2 ){
			Student s1=(Student)o1;
			Student s2=(Student)o2;
			Integer  ag1 =new Integer(s1.age);
			Integer  ag2 =new Integer(s2.age);
			
			return ag1.compareTo(ag2);
	}
}
class AgeRevSort implements Comparator
{
	public int compare(Object o1,Object o2 ){
			Student s1=(Student)o1;
			Student s2=(Student)o2;
			Integer  ag1 =new Integer(s1.age);
			Integer  ag2 =new Integer(s2.age);
			
			return ag2.compareTo(ag1);
	}
}
class R
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