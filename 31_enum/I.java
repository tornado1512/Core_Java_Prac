//we can make enum inside class
class I
{
	enum Days{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY//;
	}
	public static void main(String[] args){
		Days days = Days.MONDAY;
		System.out.println(days);
	}
}