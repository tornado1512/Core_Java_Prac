import java.io.FileWriter;
import java.io.IOException;
class J
{
	public static void main(String[] args)throws IOException{
		FileWriter fw = new FileWriter("abc.txt");
		char [] ar  = {'A','B','C','D'};
		fw.write(ar);
		fw.flush();
	}
}