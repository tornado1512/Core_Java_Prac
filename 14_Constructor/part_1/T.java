class T
{
	String name;
	int age;
	String college;
	String address;
	public static void main(String[] args){
			//entry 1
			T t = new T();
			System.out.println(t.name);
			System.out.println(t.age);
			System.out.println(t.college);
			System.out.println(t.address);
			t.name = "Vishal";
			t.age = 20;
			t.college="GGCT";
			t.address="Jabalpur";
			System.out.println(t.name);
			System.out.println(t.age);
			System.out.println(t.college);
			System.out.println(t.address);
			//entry2
			T u = new T();
			u.name = "Jatin";
			u.age = 20;
			u.college="GGITS";
			u.address="Jabalpur";
			System.out.println(u.name);
			System.out.println(u.age);
			System.out.println(u.college);
			System.out.println(u.address);
			

	}

}