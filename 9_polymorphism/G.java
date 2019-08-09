class Animal
{
	void makeSound(){
	System.out.println("Animal");
	}

}
class Dog extends Animal
{
	void makeSound(){
	System.out.println("Dog sound");
	}
}
class Cat extends Animal
{
	void makeSound(){
	System.out.println("Cat sound");
	}
}
class Cow extends Animal
{
	void makeSound(){
	System.out.println("Cow sound");
	}
}
class G
{
	public static void main(String [] args){
		Animal o = new Animal();
		o.makeSound();
		Animal a = new Dog();
		a.makeSound();
		Animal b = new Cat();
		b.makeSound();
		Animal c = new Cow();
		c.makeSound();


	}
}