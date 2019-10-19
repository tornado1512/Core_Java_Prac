//we can associate multiplevalue
enum Coffee{
			SMALL(100,"A"),MEDIUM(200,"B"),LARGE(300,"C");
			int ml;
			String lid;
			Coffee(int ml ,String lid){
				this.ml=ml;
				this.lid=lid;
			}
			public int getMl(){
				return ml;			
			}
			public String getLid(){
				return lid;			
			}
		
}
class M
{
	public static void main(String[] args){
		Coffee [] c = Coffee.values();
		for( Coffee cfz: c){
			System.out.println(cfz+"~"+cfz.getMl()+" "+ cfz.getLid());
		}
	}
}