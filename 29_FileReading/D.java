import java.io.*;
class D
{
	public static void main(String[] args)throws FileNotFoundException ,IOException{
		
		FileReader fr = new FileReader("abc.txt");

		int ch=fr.read();
		while(ch!=-1){
			System.out.print((char)ch);
			ch=fr.read();
		}
	}
}