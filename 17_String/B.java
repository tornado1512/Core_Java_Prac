class B
{
	public static void main(String[] args){
			String s = new String("mohan"); //for constructor call always new object is created in non pool area whether the String is same or not
			String t = new String("mohan");
			System.out.println(s);
			System.out.println(t);
			System.out.println(s==t	);

			String u = "mohan";
			String r = "mohan";//if object with same String value is present in pool area then new objdct is not created
			System.out.println(u==r);
	}
}