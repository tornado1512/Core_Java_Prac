class N
{
	public static void main(String[] args){
			//int [] x = new int {{ }{ }};
			
			//int [] x = new int {{ 12 ,22}{2,2221}};//we cannot assign 2d array in `1 d array
			//int [] [] x = new int {11,22,33};//we cannot ssign 1d array into 2d array
			
			//int [] x = new int [3][2] ;//2d array cannot be converted to 1d array
			//int [] [] x = new int [1] ; 
			
			//int [] [] x = new int [2.22] [22.3];
			int [] x = new int ['a'];
			System.out.println(x.length);
	}
}