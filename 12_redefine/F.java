class Car
{
}
class SportsCar extends Car
{
}
class ACar extends SportsCar
{
}
class F
{	static void pro(Car x){
		System.out.println("car");
	}
	static void pro(SportsCar x){
		System.out.println("SportsCar");
	}
	static void pro( ACar c){
		System.out.println("Acar");
	}


	public static void main(String[] args){
		ACar a = new ACar();
		F f = new ();
		f.pro(a);
	}
}