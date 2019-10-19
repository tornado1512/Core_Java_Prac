import java.io.File;
class J
{
	public static void main(String[] args){
		File file = new File("mno");
		String [] x = file.list();
		for(int i = 0 ; i<x.length;i++){
			System.out.println(x[i]);
		}

	}
}