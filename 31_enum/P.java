class O
{
	enum Coffee{
			SMALL,MEDIUM,LARGE
}
}
class P
{
	public static void main(String[] args){
		O.Coffee cfz = O.Coffee.SMALL;
		System.out.println(cfz);
	}//enum inside class will act like nested class
}