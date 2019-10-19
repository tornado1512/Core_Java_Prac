import java.util.*;
class Animal{}
class Cat extends Animal{}
class Dog extends Animal{}
class E
{
	public static void main(String[] args){

		ArrayList<Animal> a = new ArrayList<Animal>();
		/*
		Animal [] a = new Cat[2];
		a[0]=new Cat();
		a[1]= new Dog();//ArrayStoreException
		//ArrayList<Animal> list = new ArrayList<Cat>();//both side have same typeSafe
		*/
	}
}