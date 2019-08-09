class LivingBeing {}
class Animal extends LivingBeing{}
class Human  extends LivingBeing{}
class Plant  extends LivingBeing{}
class TestC
{
	public static void  main(String[] args){
		LivingBeing a = new Animal();
		LivingBeing b = new Human();
		LivingBeing c = new Plant();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}