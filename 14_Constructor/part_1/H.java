class X
{
	X(){
		System.out.println("cons of X()");
	}
}
class Y extends X
{
	Y(){
		System.out.println("cons of Y()");
	}
}
class H extends Y
{
	H(){
		System.out.println("Cons of H()");
	}
	public static void main(String[] args){
		H h = new H();
		System.out.println("in main()");
	}

}
