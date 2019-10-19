class C
{
	public static void main(String[] args){
		for(int i = 0 ; i<=5;i++){
			System.out.println("~~~~~~~~~~~~"+i);
		}
		for(int i= 6;i<=10;i++){
			System.out.println("#############"+i);//here for printing 6 we have to wait until first for loop is finished 
		}
	}
}