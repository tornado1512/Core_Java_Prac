import java.util.ArrayList;
class V
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add("mohan");
		list.add("nohan");
		list.add("bohan");
		list.add("vohan");
		list.add("zohan");

		for(int i = 0 ;i<list.size();i++){
			System.out.println(list.remove(i));
		}

	}
}