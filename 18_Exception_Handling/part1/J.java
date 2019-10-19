class J
{
	public static void main(String[] args){
		try{
			System.out.println("---------1");
			int i = Integer.parseInt(args[0]);
			System.out.println("---------2");
			int [] arr = {11,22,33};
			System.out.println(arr[i]);
			System.out.println("---------3");
			int o = 12/i;
			System.out.println("---------4");
			String s = null;
			System.out.println(s.length());
			System.out.println("---------5");
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(NumberFormatException e){
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		System.out.println("---------6");
	}
}