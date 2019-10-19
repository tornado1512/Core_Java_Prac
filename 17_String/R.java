class R
{
	public static void main(String[] args){
			String s = "Mohan is a good boy";
			String []p = s.split(" ");
			
			System.out.println(p.length);
			for( String o: p)
				System.out.println(o+"-"+o.length());
	}
}