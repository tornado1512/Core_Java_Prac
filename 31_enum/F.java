enum Days{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY//;
}

class F
{
	public static void main(String [] args){
		Days [] days = Days.values();//value function will return array of Days
		for( Days day:days ){
			System.out.println("Day is "+day);
		}
	} 
}