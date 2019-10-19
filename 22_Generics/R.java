import java.util.*;
//=rhs <Dog or parent of Dog>
//<new Dog or child of DOg >
class LivingBeing{ }
class Animal extends LivingBeing{ }
class Cat extends Animal{ }
class Dog extends Animal{ }
class Cow extends Animal{ }
class BDog extends Dog{ }
class R
{
	public static void main(String[] args){
		
		ArrayList<? super Dog> x1 = new ArrayList<Dog>();
		ArrayList<? super Dog> x2 = new ArrayList<Animal>();
		ArrayList<? super Dog> x3 = new ArrayList<LivingBeing>();
		ArrayList<? super Dog> x4 = new ArrayList<Object>();

		//case1
		/*
		x1.add(new Object());//f
		x1.add(new LivingBeing());//f
		x1.add(new Animal());//f
		x1.add(new Dog());//f
		x1.add(new BDog());
		*/
		/*
		x2.add(new Object());//f
		x2.add(new LivingBeing());//f
		x2.add(new Animal());//f
		x2.add(new Dog());//f
		x2.add(new BDog());
		*/
		x3.add(new Object());//f
		x3.add(new LivingBeing());//f
		x3.add(new Animal());//f
		x3.add(new Dog());//f
		x3.add(new BDog());
		
		

		}
}
