class Student
{
}

class D
{
	public static void main(String[] args){
		Student s = new Student();
		System.out.println(s.toString());
		System.out.println(Integer.toHexString(s.hashCode()));
	}
}