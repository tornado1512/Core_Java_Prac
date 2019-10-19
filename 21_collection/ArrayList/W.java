import java.util.ArrayList;
class W
{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add("mohan");
		list.add("nohan");
		list.add("bohan");
		list.add("vohan");
		list.add("zohan");
		int length=list.size();
		for(int i = 0 ;i<length;i++){
			System.out.println(list.remove(i));
		}

	}
}