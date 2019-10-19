class R
{
	public static void main(String[] args){
		
		byte a1 = 10;
		short a2 = 20;
		char a3 = 30;
		
		long a4 = 300;
		float a5 = 3.3f;
		double a6 = 5.55;
		//int [] arr = {a1,a2,a3,a4,a5,a6};//lossy conversion from long to int,float to int ,douuble to int
		int [] arr = {a1,a2,a3,(int)a4,(char)a5,(int)a6};
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
	}
}

/*
class R
{
	byte a = 10;
	short b = 30;
	char c = 20;
	
	long d = 334L;
	float e = 3.33f;
	double f= 3.22344;
	 
	 int j =a;
	 int k = b;
	 int l = c ;
	
	//int m = d;//lossy conversion
	//int m = e;//lossy conversion
	//int m = f;//lossy coversion
	int a1 = (int)d;
	int a2 = (int)e;
	int a3 = (int)c;


}*/