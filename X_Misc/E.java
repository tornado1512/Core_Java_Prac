//compareTo

class E
{
	public static void main(String[] args){
		/*
		String s1 = new String("mohan");
		String s2 = new String("mohan");
		String s3 = new String("mihan");
		*/
		
		//String s = "mohan";//doubt what is the difference between String direct and String new object making;
		Integer s1=new Integer(11);
		Integer s2=new Integer(11);
		Integer s3=new Integer(13);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));
		
	}
}