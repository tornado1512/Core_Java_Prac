class O
{
	public static void main(String[] args){
	try{
		System.out.println("-----------1");
		int i = Integer.parseInt(args[0]);
		System.out.println("-----------2");
		int [] arr = {11,22,33};
		System.out.println(arr[i]);
		System.out.println("-----------3");
		int o = 12/i;
		System.out.println("-----------4");
	}
	catch(ArithmeticException e){
		System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);

	}
	
	System.out.println("################");
	System.out.println("-----------6");
	}
}