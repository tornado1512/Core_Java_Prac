//illegal String constant 

class D
{
	public static void main(String[] args){
			//String s = "Mohan () %$#__:~~@!/tf||\tfefw\n\u2231";
			//String s = "hsuhuefhhfhsiesef\T";//illegal escape character
			String s = "adauhqi3y4924^&$^*#^$*(#\u90";//illegal unicode escape

			System.out.println(s);
	}
}