interface Smart
{
}
interface Intelligent{}

class Human
{
}
class American extends Human implements Intelligent, Smart
{
}

//case2
/*
class American implements Smart Intelligent extends Human
{
}
*/
//case1
/*
class American implements Smart ,Intelligent
{
}*/

