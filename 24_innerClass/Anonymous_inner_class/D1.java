class D1
{
	void abc(){}
	static D1 d1 = new D1(){
		void abc(){
			System.out.println("d1");
		}
	};
	static D1 d2 = new D1(){
		void abc(){
			System.out.println("d2");
		}
	};
	public static void main(String[] args){
		d1.abc();
		d2.abc();
	}
}