class K
{
	public static void main(String [] args){
		K k = new K();
		//case5
		final int y;
		y=90;
		//y=88;//final varibale must initializ on one time

		//case4
		//final int y ;
		//System.out.println(y);//but at time if reading y must be initialize
		//case3
		//final int P;//we canot mark final without inintializ 
		//case2
		//int q;
		//System.out.println(q);//at time of reading local level variable must mbe inititialez
		//case1
		//int o;          //instance level varibale is not inititialized to 0
	}
}