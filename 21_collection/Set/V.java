import java.util.PriorityQueue;
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
class T
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
		PriorityQueue queue= new PriorityQueue(s);
		/*
		queue.offer(new Student("mohan",21));
		queue.offer(new Student("sohan",22));
		queue.offer(new Student("fohan",20));
		queue.offer(new Student("vohan",23));
		queue.offer(new Student("zohan",29));
		queue.offer(new Student("gohan",31));
		queue.offer(new Student("gohan",31));
		queue.offer(new Student("gohan",31));
		queue.offer(new Student("gohan",31));
		queue.offer(new Student("gohan",31));
		*/
		queue.add(new Student("mohan",21));
		queue.add(new Student("sohan",22));
		queue.add(new Student("fohan",20));
		queue.add(new Student("vohan",23));
		queue.add(new Student("zohan",29));
		queue.add(new Student("gohan",31));
		queue.add(new Student("gohan",31));
		queue.add(new Student("gohan",31));
		queue.add(new Student("gohan",31));//duplicates are allowed in PriorityQueue
		queue.add(new Student("gohan",31));
		

		//System.out.println(queue);//improrper
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		
	}
}