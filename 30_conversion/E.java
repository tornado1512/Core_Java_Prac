class Animal
{
	void go(){
		System.out.println("go() of animal");
	}
}
class Dog extends Animal
{
	void go(){
		System.out.println("go of Dog");
	}
	void abc(){
		System.out.println("abc of Dog");
	}
}

class E
{
	public static void main(String [] args){
		Animal a = new Dog();
		//case1
		a.go();//at compile time ->compiler only type checks hence at this time it notice that a is animal type variable 
		//hence checks whether go() is present or not .Here go is present hence compilation pass but at runtime JVM checks the which type of Object it is holding 
		//and here it is holding Dog() hence go() of Dog runs
		/*//case2
		a.abc();//at compile time ->compiler only type checks hence at this time it notice that a is animal type variable 
		//hence checks whether go() is present or not .Here not present hence compilation fails
		*/
		//case 3
		Dog d = (Dog)a;
		d.abc();

	}
}