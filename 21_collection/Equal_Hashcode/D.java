class Student
{
	String name;
	int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}

	public boolean equals(Object obj){
		
		boolean flag=false;
		if(obj instanceof Student){
			Student s1= this;
			Student s2=(Student)obj;
			String nm1=s1.name;
			String nm2=s2.name;
			if(nm1.equals(nm2));
			{ flag =true;
			}
		}
		return flag;
	}
	public int hashCode(){
		String abcd="abcdefghijklmnopqrstuvwxyz";
		int sum=0;
		for(int i=0;i<name.length();i++){
			sum=sum+abcd.indexOf(name.charAt(i));
		}
		//System.out.println("Hashcode is"+sum);
		return sum;
	}
}
class D
{
	public static void main(String[] args){
		Student s1=new Student("mohan",21);
		Student s2=new Student("mohan",21);
		Student s3=new Student("hanmo",21);
		Student s4=new Student("sohan",21);
		Student s5=new Student("pohan",21);
		Student s6=new Student("xohan",21);
		
		//case3
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());

		//case2
		//System.out.println(s1.equals(s2));
		//System.out.println(s1.hashCode());
		//System.out.println(s2.hashCode());

		//casse1
		//System.out.println(s1.hashCode());
		//System.out.println(s1.hashCode());
		//System.out.println(s1.hashCode());

	}
}


