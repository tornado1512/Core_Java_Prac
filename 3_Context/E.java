class E
{ 
	int x=56;  //intance level var
	void show(){   //intance level method
	//System.out.println(x);     //callin!!x=context=intance x=intance level var legal
	System.out.println(e.x);     //calling!!! x=xontext=intance x=var=intance level but scope og e ends as sson as show ends hence not runnable    
} 
	public static void main(String[] args){
		E e=new E();
		e.show();                 // calling show=context=instance show=intance level method legal
	}
}