class LivingBeing{}
class Animal extends LivingBeing{}
class Cat extends Animal{}
class Cow extends Animal{}
class Dog extends Animal {}
class BDog extends Dog {}
class V
{
	public static void main(String[] args){
					Cat a1 = new Cat();
					Cow a2 = new Cow();
					Dog a3 = new Dog();
					BDog a4 = new BDog();
					Animal a5 = new Animal();
					/*
					LivingBeing a6 = new LivingBeing();
					Animal [] x = {a1,a2,a3,a4,a5,(BDog)a6};//livingBeing cannot be cast to BDog	
					*/	
					LivingBeing a6 = new BDog();
					Animal [] x = {a1,a2,a3,a4,a5,(BDog)a6};

					System.out.println(x[0]);
					System.out.println(x[1]);
					System.out.println(x[2]);
					System.out.println(x[3]);
					System.out.println(x[4]);
					System.out.println(x[5]);
	}
}