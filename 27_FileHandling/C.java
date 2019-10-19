import java.io.File;
class C
{	public static void main(String[] args){
	//case1
	//File file = new File("abc.txt");
	//case2
	//File file = new File("mno");
	//case3
	File file = new File("mno/abc.txt");

	System.out.println(file.isFile());
	System.out.println(file.isDirectory(  ));
	}
}