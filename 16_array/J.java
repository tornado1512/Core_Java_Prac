class J
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

			System.out.println(s[0][0]+"  "+s[0][1]);
			System.out.println(s[1][0]);
			System.out.println(s[2][0]+"  "+s[2][1]+"  "+s[2][2]);
	}
}