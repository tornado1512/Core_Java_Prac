class E
{
	public static void main(String[] args){
			/*try{
				System.out.println("---------------1");
//try without catch
			int i = 12/0;
			}*/
			/*
			catch{
			catch without try not allowed
			}
			*/
			try{
			System.out.println("------------1");
			int i = 12/0;
			System.out.println("-------------2");
			}
			catch(ArithmeticException e){
			System.out.println("AE");
			}

			System.out.println("-------------3");


	}
}