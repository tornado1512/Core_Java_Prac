import java.util.ArrayList;

class E
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(22);
		list.add(2);
		list.add(12);
		list.add(2);
		list.add(45);

		System.out.println(list);
		System.out.println(list.remove(2));//del 2nd index means 12
		System.out.println(list.remove(new Integer(2)));//del 1st occurnece os 2 object
		System.out.println(list);


	}
}