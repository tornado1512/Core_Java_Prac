class B{}
class C{}
interface D{}
interface E{}
//class A extends B{}

//class A extends B,C{//multiple class inheritance not allowed}

//class A extends D{}//interface cannot be extends

//class A extends D,E{}

//class A implements D{}

//class A implements D,E{}//multiple inheritabce through interface is allowed

//class A implements B{}//class cannot be implemets{}

class A implements B,C
{
}
