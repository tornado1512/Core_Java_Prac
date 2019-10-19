interface X
{////////////////////////////////doubt////////////////////////////

}
class H
{
	static X x = new X(){
		private static int o = 10;//accessing private memeber of annoynmous class
	};
	public static void main(String[] args){
		System.out.println(x.o);
		System.out.println(o);
	}
}