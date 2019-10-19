class I
{
	public static void main(String[] args){
		try{
			System.out.println("---------1");
			int i = Integer.parseInt(args[0]);
			System.out.println("---------2");
			int [] a = {11,2,33};
			System.out.println(a[i]);
			System.out.println("---------3");
			int y = 12/i;
			System.out.println("---------4");
			}
		catch(NumberFormatException e){
			System.out.println("NFE");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("AIOBE");
		}
		catch(ArithmeticException e){
			System.out.println("AE");
		}
			System.out.println("------------5");
	}
}