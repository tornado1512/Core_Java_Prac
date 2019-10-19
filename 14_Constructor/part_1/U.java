class U
{
	String name;
	int age;
	String college;
	String address;
	U(String name,int age,String college,String address){
		//this.name=name;
		//this.age=age;
		this.name=name;
		this.age=age;
		this.college=college;
		this.address=address;
		
		}
	public static void main(String[] args){
		U u = new U("Ram",20,"GGCT","Bhopal");
		 System.out.println(u.name);
		 System.out.println(u.age);
		 System.out.println(u.college);
		 System.out.println(u.address);
		 U v = new U("Mohan",20,"GGits","Jabalpur");
		 System.out.println(v.name);
		 System.out.println(v.age);
		 System.out.println(v.college);
		 System.out.println(v.address);
	}
}
