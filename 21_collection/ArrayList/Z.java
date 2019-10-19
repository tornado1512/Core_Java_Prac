import java.util.ArrayList;
class Z
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add(12);
		list.add(2.45);
		list.add("mohan");
		list.add(new A());
		System.out.println(list);

		System.out.println(((Integer)list.get(0)).parseInt("2"));//not effecient of heterogenous record


		}
}