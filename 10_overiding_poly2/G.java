//illegal overiding
class G
{
void pro(){}
}
class H extends G
{
	int  pro(){
	return 0;
	}
}
//legal overiiding
/*
class G
{
	void pro(){}
}
class H extends G
{
	void pro(){}
}
*/
