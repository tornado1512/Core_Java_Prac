 import java.util.TreeSet;

class Student implements Comparable<Student>{
	String name;
	int age;

	Student(String name,int age){
		this.name = name;
		this.age = age;
	}	

	public int compareTo(Student o){
		Student s1 = this;
		Student s2 = o;
		//compare to only one property
		/*//case1
		//String nm1 = s1.name;
		//String nm2 = s2.name;
		
		return nm1.comapreTo(nm2);
		*/

		/*
		//case2
		//int ag1=s1.age;
		//int ag2=s2.age;

		return ag1.compareTo(ag2);
		//int caNNOT BE Derefrenced
		*/
		//case3

		Integer ag1=new Integer(s1.age);
		Integer ag2=new Integer(s2.age);
		return ag1.compareTo(ag2);
	}

	public String toString(){
		return name+"~"+age;
	}
}

class S{
	public static void main(String[] args){
		TreeSet set = new TreeSet();

		set.add(new Student("rohan",23));
		set.add(new Student("gohan",7));
		set.add(new Student("mohan",12));
		set.add(new Student("eohan",10));
		set.add(new Student("hohan",15));

		System.out.println(set);
	}
}

