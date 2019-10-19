interface Z
{
	void abc();
}
class D
{
	public static void main(String[] args){
		Z z = new Z(){
				public void abc(){
					System.out.println("hello");
				}
			};
		z.abc();
	}
}