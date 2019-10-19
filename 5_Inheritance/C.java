class C extends SportsCar
{
	public static void main(String[] args){
		C x =new C();
		//case1
		System.out.println(x instanceof SportsCar);
		//case2
		//if(x instanceof SportsCar)
		//System.out.println("SportsCar is Car");
		//case3
		//if(x instanceof Car)
		//System.out.println("Car is a fourwheeler");
		//case4
		//if(x instanceof Vehicle)
		//System.out.println("Four wheeler is a vehcile");



	}
}
class Vehicle
{
}
class FourWheeler extends Vehicle
{
}
class Car extends FourWheeler
{
}
class SportsCar extends Car
{
}