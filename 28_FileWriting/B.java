import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
class B
{
	public static void main(String[] args)throws IOException{
		FileWriter f = new FileWriter("mno.txt");
		f.write('A');
		f.write('M');
		f.write('I');
		f.write('T');
		//no writer operation performed bcecause flush() not called
	}
}