import java.util.*;
class Employee 
{
	String name;
	Integer age;
	Employee(String name,Integer age){
		this.name=name;
		this.age=age;
	}
	

	public String toString(){
		return name+"~"+age;
	}
}
class NameRevSort implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2){
		return e1.name.compareTo(e2.name);
	} 
}
class D
{
	public static void main(String[] args){
		NameRevSort nrs = new NameRevSort();
		Employee [] ar = new Employee[3];
		ar[0] = new Employee("roahn",21);
		ar[1] = new Employee("Soahn",26);
		ar[2] = new Employee("Mohan",24);
		Arrays.sort(ar,nrs);//class mot comparable hence exception 
		for(Employee e:ar){
			System.out.println(e);
		}
	}
}