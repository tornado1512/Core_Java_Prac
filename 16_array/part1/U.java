class Animal{}
class Cat extends Animal{}
class Dog extends Animal{}
class BDog extends Dog{}
class U
{
	public static void main(String[] args){
		Cat a1 = new Cat();
		Dog a2 = new Dog();
		BDog a3 = new BDog();
		Animal a4 = new Animal ();
		Animal [] a = {a1,a2,a3,a4};	
	}
}