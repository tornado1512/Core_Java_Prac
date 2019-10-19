class G
{
	int y = 22;
	G(){
	//int y=99;  //declaring a new local variable
	//y=99;		 //initializing a value again to y
	}
	public static void main(String[] args){
			G g = new G();
			System.out.println(g.y);
	}
}