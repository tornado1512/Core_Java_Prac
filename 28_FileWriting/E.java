import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
class E
{
	public static void main(String [] args)throws IOException{
		File f = new File("abc.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);//parentchild doubt
		bw.write("Have a nice day");
		bw.flush();
		bw.close();

	} 
}