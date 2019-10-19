class L
{//printing of 2d array using for loop
	public static void main(String[] args ){
			//int [] [] s = {{11,22,33},{44,55,66,77},{88,99}};
			//int [] [] s = new int {{11,22,33},{44,55,66,77},{88,99}};//error
			int [] [] s = new int [] []{{11,22,33},{44,55,66,77},{88,99}};

			for(int i = 0 ; i<s.length;i++){
					for(int j = 0;j<s[i].length;j++){
							System.out.print(s[i][j]+" ");
					}
					System.out.println();
			}
		
	}
}