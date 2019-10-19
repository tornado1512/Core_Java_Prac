import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
class C
{
	public static void main(String[] args)throws IOException{
		FileWriter f = new FileWriter("mno.txt");
		f.write('A');
		f.write('M');
		f.write('I');
		f.write('p');
		//f.flush();
		f.close();
	}
}