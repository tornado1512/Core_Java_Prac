import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class G
{
	public static void main(String[] args)throws FileNotFoundException,IOException{
	
		File f = new File("abc.txt");
		FileReader fr = new FileReader(f);
		BufferedReader bw = new BufferedReader(fr);
		String str=bw.readLine();
		while((str=bw.readLine())!=null){
			System.out.println(str);
		}
	}

}