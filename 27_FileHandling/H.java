import java.io.File;
class H
{
	public static void main(String[] args){
		File file = new File("abc.txt");//file must exist
			
		File f = new File("pqr.txt");
		System.out.println(file.renameTo(f));
	}
}