class I
{	
	int y = 10;
	float o ;
	I(){				//if we define any const by own then compiler did'nt supplied default const ,it just put imp code in userdefine const
		//compiler spplied this code
		/*
		super();		//it will call no para const of parent class and it is first line code of cosnt
		this.y=10;
		this.o=0.00;
		*/
		//rest of code by written programmer............
	}
}