import java.util.*;
class B
{
	public static void main(String[] args){
		byte [] b = {12,90,34};
		Arrays.sort(b);
		for(byte a:b){
			System.out.println(a);
		}
		//all primitive type have their own sort method
	}
}