class I
{
	I abc(this){
		return this;
	}
	public static void main(String[] args){
		I i = new I();
		System.out.println(i);
		i.abc(i);
	}
}