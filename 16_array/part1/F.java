class F
{														//instance level arrayN
	//case2&3
	int [] x = new int[4]; 
	//case1
	//static float [] x = new float[2];
	//static int [] x = new int[2];
	public static void main(String[] args){
			//case1
			//System.out.println(x);
			//case2
		 	//System.out.println(x.length);//instance level variable cannot be reference from a static context
			//case3
			F f = new F();
			System.out.println(f.x.length);
					//f.x.x[0]=10;
			f.x[0]=10;
			f.x[1]=10;
			f.x[2]=10;
			f.x[3]=10;
			System.out.println(f.x[0]);
			System.out.println(f.x[1]);
			System.out.println(f.x[2]);
			System.out.println(f.x[3]);
			
	}
}