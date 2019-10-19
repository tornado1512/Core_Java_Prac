class G
{
	public static void main(String[] args){
			int [] x = new int[3];				//local level array
			System.out.println(x[0]);
			System.out.println(x[1]);
			System.out.println(x[2]);
			x[0]=10;//assigning values to array
			x[1]=20;
			x[2]=30;
			System.out.println(x[0]);
			System.out.println(x[1]);
			System.out.println(x[2]);
			//System.out.println(x[3]);//ArrayIndexOutOfBoundsException
			
			float [] y = new float[3];
			System.out.println(y[0]);
			System.out.println(y[1]);
			System.out.println(y[2]);
			y[0]=1.11f;
			y[1]=2.22f;
			y[2]=3.33f;
			System.out.println(y[0]);
			System.out.println(y[1]);
			System.out.println(y[2]);

	}
}