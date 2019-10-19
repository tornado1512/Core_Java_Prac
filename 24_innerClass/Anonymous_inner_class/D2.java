class D2
{
	void abc(){}
	static D2 d1 = new D2(){
		void abc(){
			System.out.println("d1");
		}
	};
	static D2 d2 = new D2(){
		void abc(){
			System.out.println("d2");
		}
	};
	public static void main(String[] args){
		 D2 d2 = new D2(){
		void abc(){
			System.out.println("d3");
		}
	};
	
		d1.abc();
		d2.abc();
	}
}