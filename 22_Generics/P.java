import java.util.*;
class P
{
	public static void main(String [] args){
		ArrayList<Integer> a = new ArrayList<Integer>();
		abc(a);
		ArrayList<Float> b = new ArrayList<Float>();
		abc(b);
	}

	static void abc(ArrayList<? extends Number> e){
	
	}
	/*
	static void abc(ArrayList< Number> e){
		
	}
	*/
	/*
	static void abc(ArrayList<Integer> e){
		
	}
	static void abc(ArrayList<Float > e){
	
	}
	*/
}