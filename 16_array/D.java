class D
{
	public static void main(String[] args){
			String [] s = {"puroshattam","atharvada","yujurveda","samveda","abhiyukt"};
			//String [] p = null;
			String[] p = new String[s.length];
			for(int i = 0;i<s.length;i++){
			p[i] = s [i];
			}
			for(int i = 0;i<s.length;i++){
			System.out.println(p[i]+"-"+p[i].length());
			}
	}
}