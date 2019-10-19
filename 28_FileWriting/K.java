import java.io.*;
class K
{
	public static void main(String[] args)throws IOException{
		//case2
		FileWriter fw = new FileWriter("abc.txt",true);
		fw.write("shyam");
		fw.flush();
		fw.close();
	
		/*
		//case1
		FileWriter fw = new FileWriter("abc.txt");
		fw.write("shyam");
		fw.flush();
		fw.close();
	*/
	}
}