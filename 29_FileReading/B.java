import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
class B
{
	public static void main(String[] args){
		try
		{
			File f = new File("abc.txt");
			FileReader fr = new FileReader(f);
			int r = fr.read();
			System.out.println((char)r);
			int r1 = fr.read();
			System.out.println((char)r1);
			int r2 = fr.read();
			System.out.println((char)r2);
			int r3 = fr.read();
			System.out.println((char)r3);
			int r4 = fr.read();
			System.out.println((char)r4);
			int r5 = fr.read();
			System.out.println((char)r5);
			int r6 = fr.read();
			System.out.println((char)r6);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		
		}
	}
}