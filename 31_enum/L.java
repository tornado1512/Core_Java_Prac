enum Coffee{
			SMALL(100),MEDIUM(200),LARGE(400);
			private int ml;
			Coffee(int ml){
			this.ml=ml;
			}
			public int getMl(){
				return ml;
			}
}
	
class L
{
	public static void main(String [] args){

		Coffee [] coffee = Coffee.values();
		for(Coffee c : coffee){
			System.out.println(c+"~"+c.getMl());
		}
	}
}