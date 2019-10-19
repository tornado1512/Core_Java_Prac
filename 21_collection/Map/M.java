import java.util.HashMap;

class Student
{
	String name;
	int age;
	Student (String name,int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object obj){
			boolean flag =false;
		if(obj instanceof Student){
			Student s1=this;
			Student s2=(Student )obj;
			String nm1 =s1.name;
			String nm2=s2.name;
			int ag1=s1.age;
			int ag2=s2.age;
			if(nm1.equals(nm2)&&ag1==ag2){
				flag=true;
			}

		}
		return flag;
	}
	public int hashCode(){
		int sum=0;
		String abcd="abcdefghijklmnopqrstuvqxyz";
		for(int i=0;i<name.length();i++){
			sum=sum+abcd.indexOf(name.charAt(i));
		}
		sum=sum+age;
		return sum;
	}
	public String toString(){
		return name+"~"+age;
	}


}
class M
{
	public static void main(String [] args){
		HashMap<Student,String> map = new HashMap<Student,String>();
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