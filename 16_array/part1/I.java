class Student{
	String name;
	int age;

	Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		System.out.println("hello");
		return name+"-"+age;
	}
}

class I{
	public static void main(String[] args){
		Student[] x = new Student[2];
		System.out.println(x);
		System.out.println(x[0]);//when va;ue is null then toString is not call

		System.out.println(x[1]);
		x[0] = new Student("mohan",12);
		x[1] = new Student("dinesh",23);

		System.out.println(x[0]);
		System.out.println(x[1]);

	}
}