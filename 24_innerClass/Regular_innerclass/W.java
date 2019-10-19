//case2:cyclic inheritance

class W extends W.X 
{
	class X
	{
	}
}
//case 1 : we cannot make nested class as parent of outer class
/*
class W extends X 
{
	class X
	{
	}
}*/