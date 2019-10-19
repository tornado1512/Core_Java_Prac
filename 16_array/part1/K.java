class City{
	String city;
	City(String city){
		this.city=city;
	}
}
class State{
	String state;
	State(String state){
		this.state=state;
	}
}
class Address
{
	State state;
	City city;
	Address(State state,City city){
		this.state=state;
		this.city=city;
	}
}
class Student
{
	String name;
	int age;
	Address address;
	Student(String name,int age,Address address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public String toString(){
		return name+"-"+age+"-"+address.city.city+"-"+address.state.state;
	}
}
class K
{
	public static void main(String[] args){
		Student [] x= new Student[2];
		City c = new City("Jbp");
		State s = new State("MP");
		Address a = new Address(s,c);
		x[0]=new Student("mohan",21,a);
		System.out.println(x[0]);

	}
}










