import java.io.File;
class L
{
	public static void main(String[] args){
		//File file = new File("F:/My_Java/Java_prac","FileHandling/mno");
		File f = new File("F:/My_Java/Java_prac");
		File file = new File(f,"FileHandling/mno");
		System.out.println(file.exists());
	}
}