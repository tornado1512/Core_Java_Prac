class K
{
	public static void main(String[] args){
			String[][] s = new String[3] [];
			//assigning different values to arrays
			s[0]= new String[2];
			s[1]= new String[1];
			s[2]= new String[3];

			s[0][0] = "a1";
			s[0][1] = "a2";

			s[1][0] = "b1";
			
			s[2][0] = "c1";
			s[2][1] = "c2";
			s[2][2] = "c3";

			for(int i= 0;i<s.length;i++){
				System.out.println(s[i].length);

			}
			for(int i=0;i<s.length;i++){
				for(int j=0;j<s[i].length;j++){
					System.out.print(s[i][j]+"  ");
					}
					System.out.println();
			}

			}
}