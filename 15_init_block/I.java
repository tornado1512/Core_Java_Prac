class I
{
	static {// order will be from top to bottom
	System.out.println("Block C");
	}
	static {
	System.out.println("Block B");
	}
	
	static {
	System.out.println("block A");
	}
	
	public static void main(String[] args){
	I i = new I();
	}
}