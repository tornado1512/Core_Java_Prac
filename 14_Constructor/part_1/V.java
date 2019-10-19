class Shape
{
	int l;
	int h;
	int w;

	Shape(int l){
		this.l=l;
	}
	Shape(int l, int w){
		this.l=l;
		this.w=w;
	}
	Shape(int l,int w,int h){
		this.l=l;
		this.w=w;
		this.h=h;
	}
}

class V
{
	public static void main(String[] args){
		//Shape s = new Shape();
		Shape s = new Shape(10);
		Shape t = new Shape(10,30);
		Shape u = new Shape(40,50,60);
		System.out.println("length is"+u.l);
		System.out.println("width is"+u.w);
		System.out.println("height is"+u.h);
	}
	
}