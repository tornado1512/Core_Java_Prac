class C
{
	public static void main(String[] args){
			String s = "Mohan";
			String v = "Mohan";
			String t = new String(s);
			String u = new String(s);

			System.out.println(s==v);
			System.out.println(s==t);
			System.out.println(s==u);
			System.out.println(t==u);

			
	}
}