import java.util.LinkedList;

class Y
{
	public static void main(String[] args){
		LinkedList list = new LinkedList();



		//as a quque

		list.offer("mohan");
		list.offer("johan");
		list.offer("bohan");
		System.out.println(list.peek());
		System.out.println(list.peek());
		System.out.println(list.peek());
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());
		/*
		//as a list
		list.add("mohan");
		list.add("Sohan");
		list.add("Bohan");

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list);
		System.out.println(list.remove(0));
		System.out.println(list.remove(1));
		System.out.println(list);
		*/
	}

}