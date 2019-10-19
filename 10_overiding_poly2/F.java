//overloading method
class F 
{
	void pro(int a,float b){}//parameter mismatch
}
class G extends F
{
	void pro(float b,int a){}
}

//overidding method
/*
class F 
{
	void pro(int a,float b){}
}
class G extends F
{
	void pro(int a,float b){
}
}*/