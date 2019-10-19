class Ic
{
	public static void main(String[] args){
			String a="mohna";
			System.out.println(a);
			String [] s = new String[2];
			System.out.println(s[0]);//tostring is not call when null
			s[0]="mohan";
			System.out.println(s[0]);//incase of toString() returns  String
			System.out.println(s[0].toString());
			/*int [] ar = new int[2];
			System.out.println(ar[0]);//gives a 0 
*/


	}

}