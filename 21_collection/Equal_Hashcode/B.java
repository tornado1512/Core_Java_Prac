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
		Student s1=this;
		Student s2=(Student)obj;
		//String nm1=s1.name;
		//String nm2=s2.name;
		int ag1 = s1.age;
		int ag2 = s2.age;
		if(nm1.equals(nm2)&&equals==ag2){
			flag=true;
		}
		
			}
			return flag;
		}	
		public String toString(){
		return name+"~"+age;
		}

}
class B
{
	public static void main(String[] args){
		Student s1 = new Student("mohan",21);
		Student s2= new Student("mohan",21);
		
		System.out.println(s1.equals(s2));
		Integer i = new Integer(21);
		System.out.println(s1.equals(i));//only pass Student object 
	}
}