class J
{
	void abc(){}
	static J j = new J(){//anonyous in same class
		void abc(){
		System.out.println("hiiiiiiiiiiiiiiiiii");
	}	
	};
	public static void main(String[] args){
		j.abc();
		System.out.println(j);
	}

}