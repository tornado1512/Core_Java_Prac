import java.io.File;
class G
{
	public static void main(String[] args){
		File file = new File("mno/abc");
		System.out.println(file.exists());
		//file.mkdir();//if mno exist then abc will be made but if mno not exist then  this method will be fail because using this only one folder will be make
		file.mkdirs();

		System.out.println(file.exists());
	}
}