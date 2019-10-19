import java.util.ArrayList;
class A
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add("mohan");
		list.add("sohan");
		list.add("rohan");
		list.add("johan");
		list.add("gohan");
		list.add("zohan");
		list.add("vohan");
		Object [] arr= list.toArray();
		System.out.println(list);
		for(Object obj:arr){
			System.out.println(obj);
		}
	}
}