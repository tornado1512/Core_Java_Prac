class Animal{}
class Dog extends Animal{}
class BDog extends Dog	{}
class Cat extends Animal{}
class Plant
{
}
//case5
class A
{
	Dog pro(){
	return null;
	}
}
class B extends A
{
	Animal pro(){
	return 0;
	}
}
//case4
/*class A
{
	Dog pro(){
	return null;
	}
}
class B extends A
{
	Cat pro(){
	return null;
	}
}
*/
//case3
/*class A
{
	Animal pro(){
	return null;
	}
}
class B extends A
{
	BDog pro(){
	return null;
	}
}*/

//case2
/*class A
{
	Animal pro(){   //parent class As a return type
	return null;
	}
}
class B extends A
{
	Dog pro(){		//Child class as return type
	return null;
	}
}*/
//case1
/*class A
{
	Animal pro(){		//same return type
		return null;
	}
}
class B extends A
{
	Animal pro(){		//same return type
		return null;
	}
}*/