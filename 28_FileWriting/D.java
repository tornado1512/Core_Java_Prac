import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
class D
{
	public static void main(String[] args)throws IOException{
		FileWriter f = new FileWriter("mno.txt");
		f.write("Have a nice Day");
		//f.flush();
		f.close();
	}
}