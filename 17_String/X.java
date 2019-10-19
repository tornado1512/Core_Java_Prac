class X{
	public static void main(String[] args){
			String s = "Mohan";
			String p = new String (s);
			System.out.println(p==s);	
			System.out.println(s.equals(p));//in string class equal method is overide which compares the value of String object
	}
}