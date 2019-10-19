class U
{
	public static void main(String [] args){
			String s = "Mohan is a good boy";
			//String i = s.replace("mohan","dinesh");//if replace doesnt occur then new object is not created
			String i = s.replace("Mohan","dinesh");//if replace occur then new object is created
			System.out.println(s==i);
			System.out.println(s);
			System.out.println(i);
	}

}