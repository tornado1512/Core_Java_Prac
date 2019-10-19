import java.lang.*;
class B
{
	void show(){
		System.out.println("helloo");;
	}

}
class C extends B
{
	public static void main(String[] args){
		C c=new C();
		c.show();

	}
}