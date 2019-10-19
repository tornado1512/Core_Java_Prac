class Animal {}
class Dog extends Animal{}
class BDog extends Dog{}
class W
{
	public static void main(String[] args){
			Animal [] a = new Dog[2];
			a[0]=new Dog();
			a[1]=new Dog();
			System.out.println(a[0]);
			System.out.println(a[1]);
	}
}
