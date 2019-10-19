import java.io.File;
class B
{
	public static void main(String[] args){
		
		//case1
		//File file = new File("abc.txt");//file
		//case2
		File file = new File("mno"); 

		System.out.println(file.exists());//why it is return true in case 2 bcoz returns true whether file or directory exist or not
		System.out.println(file.isFile());//check for only file
		System.out.println(file.isDirectory());//check for only directory
	}
}