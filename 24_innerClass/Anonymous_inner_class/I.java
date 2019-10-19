interface X
{
	int i = 10;
}

class I
{
	static X x = new X(){//we have mark here static so that in accesing x in psvm() cannot create error
		private int i  = 120;//doubt why its not overwritehere
	};
	public static void main(String[] args){
		//System.out.println(i);
		System.out.println(x.i);
	}
}