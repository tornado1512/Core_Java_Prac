class LivingBeing{}
class Animal extends LivingBeing{}
class Human extends LivingBeing{}
class Plant extends LivingBeing{}
class Dog extends Animal{}
class Bdog extends Dog{}
class TestB
{
	public static void main(String[] args){
		//case7
		Plant a = new Bdog();
		
		//case6
		//Human a = new Bdog();
		
		//case5
		//Object a = new Bdog();
		
		//case4
		//LivingBeing a = new Bdog();
		
		//case3
		//Animal a = new Bdog();
		
		//case2
		//Dog a = new Bdog();
		
		//case1
		//Bdog a = new Bdog();
	}

}