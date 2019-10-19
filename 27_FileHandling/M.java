import java.io.File;
class M
{
	public static void main(String [] args){
		File file= new File("mno");
		//we cannot delete because mno contains other dir/file
		System.out.println(file.exists());
		System.out.println(file.delete());
		System.out.println(file.exists());
	}
}