import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

class F
{
	public static void main (String[] args)throws IOException{
		FileWriter fw = new FileWriter("mohan.txt");
		//fw.write("mohan is good boy \n he is from jbp");
		//fw.flush();//doubt it will work \n 
		BufferedWriter br = new BufferedWriter(fw);
		br.write("he is a good boy");
		br.newLine();
		br.write("he is from jbp");
		br.flush();
	}
}