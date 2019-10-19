import java.util.ArrayList;

class D
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add("mohan");
		list.add("gohan");
		list.add("tohan");
		list.add("bohan");
		list.add("lohan");
		System.out.println(list);


		System.out.println(list.remove(2));//int parametrized position of index
		System.out.println(list.remove("bohan"));//object parametrized
		
		System.out.println(list);


	}
}