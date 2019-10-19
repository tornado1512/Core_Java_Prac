class K
{
	public static void main(String[] args)throws CommandLineEmptyException{
		if(args.length==0){
			try{
			throw new CommandLineEmptyException("missing command Line argument");
			}catch(Exception e){
				//System.out.println(e.getMessage()+"1");
				//System.out.println(e);
				//e.printStackTrace();
			}
		}
	}
} 
class CommandLineEmptyException extends Exception
{
	CommandLineEmptyException(String message){
		super(message);
		
	}
}//message