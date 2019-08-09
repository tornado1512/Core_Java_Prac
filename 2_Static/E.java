class circle
{
	int r;                                                               //intance level h variable
	static float pi=3.14f;											 //class level varibale
	void calcArea()												//intance level method
	{ System.out.println(pi*r*r);											
	}
	static void show()											f//class level method
	{System.out.println("area of circle is ");
	}
	public static void main(String[] args)								 //class level method
	{ circle a=new circle();											 //local level varible
	a.r=33;
	show();
	a.calcArea();
	circle b=new circle();
	b.r=10;
	show();
	b.calcArea();

	}
}