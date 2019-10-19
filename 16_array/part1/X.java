class Animal{}
class Cat extends Animal{}
class Cow extends Animal{}
class Dog extends Animal{}
class X
{
	public static void main(String[] args){
			Animal [] a = new Dog[2];
			a[0] = new Cat();				//ArrayStoreException Cat will not lie in the inheritance tree of Dog
			a[1] = new Cow();
	}
}