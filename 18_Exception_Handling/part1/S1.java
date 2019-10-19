class S1
{
			
			public static void main(String[] args){
				System.out.println("---------a");
				abc();
				System.out.println("---------b");
			}
			static void abc(){
			System.out.println("----------1");
			mno();
			System.out.println("----------2");
			}
			static void mno(){
			System.out.println("----------3");
			pqr();
			System.out.println("----------4");
			}/*error
			try{
			static void pqr(){
			System.out.println("----------3");
			int i = 12/0;
			System.out.println("----------4");
			}
			catch(ArithmeticException e){
				System.out.println
			}*/
			
			static void pqr(){
			try{
				System.out.println("----------3");
				int i = 12/0;
				System.out.println("----------4");
			}catch(ArithmeticException e){
				System.out.println(e);	
			}
			}
}