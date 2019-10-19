//user input
import java.io.*;

class B
{
	public static void main(String[] args){
		Console c = System.console();
		String str = c.readLine();
		int N = Integer.parseInt(str);//for N
		String str1= c.readLine();//for string
		String str2 = c.readLine();//for
		int Q = Integer.parseInt(str2);
		while(Q--!=0){
			String str3 = c.readLine();
			int P = Integer.parseInt(str3);
			P--;
			int j=0; 
			for(int i = 0 ; i<P ; i++){
				if(str1.charAt(i)==str1.charAt(P));{
				j++;
				}
			}
			System.out.println(j);
		}
		

	}
}