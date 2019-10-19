import java.io.File;
import java.io.IOException;
class E
{
	public static void main(String[] args)throws IOException{
		File file = new File("abc.txt");
		System.out.println(file.exists());
		//file.createNewFile();throws IOException hence must be caught or declare
		//file.createNewFile();
		System.out.println(file.createNewFile());
		System.out.println(file.exists());

	}
}