import java.io.*;
class C
{
	public static void main(String[] args)throws FileNotFoundException ,IOException{
		
		FileReader fr = new FileReader("abc.txt");

		int ch=fr.read();
	do
	{
		System.out.println((char)ch);
		ch=fr.read();
	}
	while (ch!=-1);
	fr.close();
	}
}