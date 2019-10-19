class G
{
	public static void main(String[] args){
		System.out.println(abc());
	}
	static int abc(){
		try{
			return 12;
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally{
			return 90;
			//System.out.println("----------1");
		}
		//System.out.println("-------------2");
		//return 40;
	}
}