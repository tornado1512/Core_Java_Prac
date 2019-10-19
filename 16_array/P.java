//printing of 2d array using for loop
class P
{
	public static void main(String[] args){
			int [] [] a = new int [] []{ {11 ,21,11},{221,22,2221},{554,22,456} };
			for( int[] x : a )
		{
				for( int y : x){
			System.out.print(y+" ");
			}
			System.out.println();
	}

	}
}