import java.util.*;
class O
{
	public static void main(String[] args){
		//ArrayList<Number> a = new ArrayList<Integer>();
		//ArrayList<Number> a = new ArrayList<Float>();

		ArrayList<? extends Number> a1= new ArrayList<Integer>();
		ArrayList<? extends Number> a2= new ArrayList<Float>();
		//ArrayList<? extends Number> a3= new ArrayList<? extends Number> ();
		//ArrayList a3= new ArrayList<? extends Number> ();
	}
}