class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

class M
{
	public static void main(String[] args){
		Cat e = new Cat();
		Dog d = new Dog();
		Animal a = new Animal();
		abc(e);
		abc(d);
		abc(a);
	}
	static void abc(Animal e){
	
	}
}