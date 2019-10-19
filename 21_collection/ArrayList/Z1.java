import java.util.ArrayList;
class Z1
{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(2.45);//incompatible conversion
		list.add("mohan");//incompatible conversion
		list.add(new A());//incompatible conversion
		System.out.println(list);
		
	}
}