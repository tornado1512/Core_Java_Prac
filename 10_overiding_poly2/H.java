//illegal overiding
class H
{
	int pro(){
		return 0;
	}
}
class G extends H
{
	byte pro(){
		return false;
	}
}
//legal overiiding 
/*
class H
{
	int pro(){
		return 0;
	}
}
class I extends H
{
	int pro(){
		return 0;
	}
}*/