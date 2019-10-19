class M{
	
	public static void main(String[] args){
			int [] [] s = {{11,22,33},{44,55,66,77},{88,99}};
			int [] [] p = null;
			p = new int [s.length][];
			p[0]=new int [s[0].length];
			p[1]=new int [s[1].length];
			p[2]=new int [s[2].length];
			
			for(int i= 0 ;i<s.length;i++){
				for(int j = 0 ; j < s[i].length;j++){
					p[i][j] = s[i][j];
				}
				}
			for(int i= 0 ;i<s.length;i++){
				for(int j = 0 ; j < s[i].length;j++){
					System.out.print(p[i][j]+" " );
				}
				System.out.println();
			}

	}
}