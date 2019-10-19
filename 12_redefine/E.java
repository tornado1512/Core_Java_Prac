class Car
{
}
class SportsCar extends Car
{
}
class E
{
	static void pro(Car x){
		System.out.println("Car");
	}
	static void pro(SportsCar x){
		System.out.println("SportsCar");
	}
	public static void main(String[] args){
		Car c = new Car();
		pro(c);
	}
}