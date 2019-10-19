import java.util.*;
class Animal{}
class Dog extends Animal{ }
class BDog extends Animal{}
class Cat extends Animal{}
class G
{
	public static void main(String[] args){
		ArrayList<Animal> list= new ArrayList<Animal>();
		list.add(new Animal());
		list.add(new Cat());
		list.add(new Dog());
		list.add(new BDog());
		
		}
}