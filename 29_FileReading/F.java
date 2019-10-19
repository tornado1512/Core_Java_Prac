import java.io.*;
import java.util.Arrays;

class F
{
	public static void  main(String[] args)throws FileNotFoundException,IOException{
		FileReader fr = new FileReader("abc.txt");
		char [] c = new char[10];
		int x=0;
		while(fr.read(c)!=-1){
			for( char cr:c){
				System.out.print(cr);
			}
			Arrays.fill(c,'\0');
		}
		
	}
}