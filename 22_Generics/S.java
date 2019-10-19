import java.util.*;
interface A{}
interface B extends A{}
class S
{
	public static void main(String[] args){
		ArrayList<?extends A> x = new ArrayList<B>();
		ArrayList<? super B> s = new ArrayList<A>();
	}


}