class F
{
	static void abc(byte b){
	
	}
	public static void main(String[] args){
		int a  = 12;
		//abc(a);//NOTOK

		//abc(12);//NOTOK

		abc((byte)12);
	}
}