import java.io.File;
class I
{
	public static void main(String[] args){
		File file = new File("abc/mno/pqr.txt");//doubt
		File f = new File("New");
		System.out.println(file.renameTo(f));
	}
}