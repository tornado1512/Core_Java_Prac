class Animal
{
	void makeSound(){
	System.out.println("animal sound");
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
	System.out.println("Cat Sound");
	}
}
class Cow extends Animal
{
	void makeSound(){
	System.out.println("Cow sound");
	}
}
class F
{
	/*static void callSound(Cat c){
	c.makeSound();
	}
	static void callSound(Dog d){
	d.makeSound();
	}
	static void callSound(Cow c){
	c.makeSound();
	}
	*/
	static void callSound(Animal a){
	a.makeSound();
	}
 
	public static void main(String [] args){
	Cat c = new Cat();
	callSound(c);
	Dog d = new Dog();
	callSound(d);
	Cow a = new Cow();
	callSound(a);

	}

}