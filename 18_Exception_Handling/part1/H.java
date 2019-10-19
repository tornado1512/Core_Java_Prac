class H
{
	public static void main(String[] args){
		try{
		System.out.println("-----------1");
		int i = Integer.parseInt(args[0]);
		System.out.println("-----------2");
		int [] a = {11,22,33};
		System.out.println(a[i]);
		System.out.println("-----------3");
		int j = 12/i;
		System.out.println(j);
		System.out.println("-----------4");
	}
	catch(Exception e){
		System.out.println("#############5");
	}
	}
}