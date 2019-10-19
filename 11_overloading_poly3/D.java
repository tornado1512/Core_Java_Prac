class D		//differbce between overloading and overriding
{
	void pro(){}
	void pro(int x){}
}
class E extends D
{
	void pro(){}
	void pro(float f){}
}
class F extends E
{
	void pro( float y){}
}