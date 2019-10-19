import java.io.PrintWriter;
import java.io.FileNotFoundException;
class I
{
	public static void main(String[] args) throws FileNotFoundException{
		PrintWriter pw = new PrintWriter("abc.txt");
		//pw.writer('A');
		//pw.writer(true);
		//pw.writer(12.23);
	
		pw.println(true);
		pw.println(12.34);
		pw.flush();
		//different version println is present for different type
	}
}