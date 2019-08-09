class Student extends Pen
{
	public static void main(String [] args){
	//is-A relationship pesent (wrong relation student is a pen )
		Student s=new Student();
		s.show();
	}
} 

class Pen
{

	void show()
	{
	System.out.println("helloo>>>>>>>>>>1");
	}
}