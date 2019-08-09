class L
{
	final static float PI=3.14f;
	int radius;
	void calcArea(){
	System.out.println(PI*radius*radius);
	}
	public static void main(String[] args){
	L l = new L();
	l.radius=4;
	l.calcArea();
	}
}