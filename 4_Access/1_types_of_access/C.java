class Student{	 
	public static void main(String[] arg){
		Pen p=new Pen();						//Has-A realationship(right) access through instantiation
		p.show();
		}
}
class Pen{
	void show(){
		System.out.println("hellloo");
	}
	
}