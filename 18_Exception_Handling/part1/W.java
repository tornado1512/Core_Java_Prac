import java.io.*;
//case3
class W
{
	public static void main(String[] args)throws FileNotFoundException,NullPointerException{
		File e = new File("abc.txt");
		FileReader a = new FileReader(e);
		
	}
}

//case2
/*
class W
{
	public static void main(String[] args){
		try
		{
			File e = new File("anc.txt");
			FileReader a = new FileReader(e);
		}
		catch (Throwable e)
		{
			System.out.println(e);
		}
	}
}
*/

//case1
/*
class W
{
	public static void main(String[] args){
		File a = new File("abc.txt");
		FileReader p = new FileReader(a);//FileNotFoundException is comes under the category of checked exception hence it must be handle or declare
	}
}
*/