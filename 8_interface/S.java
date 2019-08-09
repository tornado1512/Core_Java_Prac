interface X
{
	void pro();
}
class Y //implements X
{ public void pro(){}
}
class S extends Y implements X
{
	//void pro(){}
}