import java.util.ArrayList;
class B//doubt
{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("mohan");
		list.add("sohan");
		list.add("rohan");
		list.add("johan");
		list.add("gohan");
		list.add("zohan");
		list.add("vohan");
		String [] arr = new String[0];
		String []ar = list.toArray(arr);
		for(String str:ar){
			System.out.println(str);
		}
	}
}
