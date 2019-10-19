class F
{
	public static void main(String[] args){
			try{
				System.out.println("---------1");
				String s = null;
				System.out.println(s.length());
				System.out.println("----------2");

			}
			catch(Exception e){
				System.out.println("NPE");
			}
	}
	
	}