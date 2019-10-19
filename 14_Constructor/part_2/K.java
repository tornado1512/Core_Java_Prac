class K
{	//case1
	//int a=0;
	//case2
	static int a=0;
	K(){
	a++;
	}
	public static void main(String[] args){
			K k1 = new K();
			K k2 = new K();
			K k3 = new K();
			K k4 = new K();
			System.out.println(k1.a);
			System.out.println(k2.a);
			System.out.println(k3.a);
			System.out.println(k4.a);

	}
}