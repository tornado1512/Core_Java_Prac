import java.io.File;
class D
{
	public static void main(String[] args){

		File file= new File("abc.txt");
		
		//case2
		File f = file.getAbsoluteFile();
		System.out.println(f);
		System.out.println(file);

		System.out.println(file==f);

		//case1
		//String s = file.getAbsolutePath();
		//System.out.println(s);
	}
}