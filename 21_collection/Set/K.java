import java.util.HashSet;

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
		System.out.println("hashcode");
		//sum=sum+age;
		return sum;
	}
	public String toString(){
		return name+"~"+age;
	}
}
class K
{
	public static void main(String[] args){
		HashSet set= new HashSet();

		set.add(new Student("mohan",21));
		set.add(new Student("sohan",32));
		set.add(new Student("gohan",43));
		set.add(new Student("tohan",12));
		set.add(new Student("kohan",22));
		set.add(new Student("vohan",23));
		set.add(new Student("vohan",21));
		System.out.println(set);

		Student s = new Student("gohan",2);
		//System.out.println(set.remove(s));
		System.out.println(set.contains(s));
		System.out.println(set);






	}
}




