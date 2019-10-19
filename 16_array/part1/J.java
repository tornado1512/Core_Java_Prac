class City
{
	String city;
		City(String city){
				this.city=city;
		}
}
class State
{ String state;
		State(String state){
				this.state=state;
		}
}

class Address
{ City city;
	State state;
	Address(City city,State state){
		this.city=city;
		this.state=state;
	}
}
class Student
{
	Address address;
	String name;
	int age;
	Student(String name,int age,Address address){
			this.name=name;
			this.age=age;
			this.address=address;
	}
	public String toString(){
			return name+"-"+age+"-"+address.city.city+"-"+address.state.state;
	}
}
class J
{
	
	public static void main(String [] args){
			Student [] x = new Student[2];	
			x[0] = new Student("Mohan",22,new Address(new City("Jabalpur"),new State("M.P")));
			System.out.println(x[0]);
			x[1]= new Student("Ram",34,new Address(new City("Bhopal"),new State ("Mp")));
			System.out.println(x[1]);
			
			System.out.println(x[0].address.city.city);
			System.out.println(x[0].address.state.state);

	}
}