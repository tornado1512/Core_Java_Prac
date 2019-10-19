import java.util.LinkedHashSet;//ordered

class Student
{
	String name;
	int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object obj){
		
		boolean flag=true;
		if(obj instanceof Student){
			Student s1=this;
			Student s2=(Student)obj;
			String nm1=s1.name;
			String nm2=s2.name;
			int ag1=s1.age;
			int ag2=s2.age;
			if(nm1.equals(nm2)){
			flag =true;
			}
		}
		return flag;
	}

	public int hashCode(){
		int sum=0;
		String abcd="abcdefghijklmnopqrstuvwxyz";
		for(int i=0; i < name.length();i++){
			sum=sum+abcd.indexOf(name.charAt(i));
		}
		return sum;
	}
	public String toString(){
		return name+"~"+age;
	}
}
class L
{
	public static void main(String[] args){
		LinkedHashSet set= new LinkedHashSet();

		set.add(new Student("mohan",21));
		set.add(new Student("sohan",21));
		set.add(new Student("gohan",21));
		set.add(new Student("tohan",21));
		set.add(new Student("kohan",21));
		set.add(new Student("vohan",21));
		set.add(new Student("vohan",21));
		System.out.println(set);

		Student s = new Student("gohan",2);
		//System.out.println(set.remove(s));
		System.out.println(set.contains(s));
		System.out.println(set);






	}
}




