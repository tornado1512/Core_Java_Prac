import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class A
{
	public static void main(String[] args){
		


		try{
			FileWriter fw = new FileWriter("abc.txt");
		}catch(IOException e){
			e.printStackTrace();
		}
		/*
		//case1

		File f = new File("abc.txt");

		//FileWriter fw = new FileWriter(f);//throws IOException
		try{
			FileWriter fw = new FileWriter(f);
		}catch(IOException e){
			e.printStackTrace();
		}
		*/
	}
}