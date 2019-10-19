class E
{
	public static void main(String[] args){
				String [] s = {"puroshattam","atharvada","yujurveda","samveda","abhiyukt"};
				//String [] p = null;
				String [] p = new String [s.length];
				/*//case1
				for(int i = 0,j=s.length-1 ; i<s.length ; i++,j-- ){
						p[i]=s[j];
						}
						*/
				//case2
				for(int i=0;i<s.length;i++){
						p[s.length-i-1]=s[i];
				}
				for(int i=0;i<s.length;i++){
				System.out.println(p[i]);
				}
	}
}