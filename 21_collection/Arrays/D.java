import java.util.*;
class Employee implements Comparable<Employee>
{
	String name;
	Integer age;
	Employee(String name,Integer age){
		this.name=name;
		this.age=age;
	}
	public int compareTo(Employee e){
		return this.name.compareTo(e.name);
	} 

	public String toString(){
		return name+"~"+age;
	}
}
class D
{
	public static void main(String[] args){
		Employee [] ar = new Employee[3];
		ar[0] = new Employee("roahn",21);
		ar[1] = new Employee("Soahn",26);
		ar[2] = new Employee("Mohan",24);
		Arrays.sort(ar);//class mot comparable hence exception 
		for(Employee e:ar){
			System.out.println(e);
		}



	}
}