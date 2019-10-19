class J
{
	public static void main(String[] args)throws CommandLineEmptyException{
		
		System.out.println("----------1");
		if(args.length==0){
			//throws CommandLineEmptyException();//wromg statement
			//throw CommandLineEmptyException();//uninstantiated  statement
			//throw new CommandLineEmptyException();//unreported exception must be caught or declare 
			throw new CommandLineEmptyException();
			//who is printing
			}
		System.out.println("----------2");
		System.out.println(args[0]);

	}
}

class CommandLineEmptyException extends Exception
{

}