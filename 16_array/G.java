class G
{
	public static void main(String[] args){
	String [] [] s= new String[3][2];

	System.out.println(s);						//s=2d array of String ref var				
	//1d array of string array 
	System.out.println(s[0]);					//s[0]=(1d array of string) ref var/ref var of (1-d array of string)/an array of string ref var
	System.out.println(s[1]);					//s[1]=(1d array of string) ref var
	System.out.println(s[2]);					//s[2]=(1d array of string) ref var
	
	//an array of string //
	System.out.println(s[0][0]);				//string ref var	 
	System.out.println(s[0][1]);				//string ref var
					
	System.out.println(s[1][0]);				//string ref var
	System.out.println(s[1][1]);				//string ref var

	System.out.println(s[2][0]);				//string ref var
	System.out.println(s[2][1]);				//string ref var
	



	



	}
}