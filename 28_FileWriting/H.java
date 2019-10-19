import java.io.PrintWriter;
import java.io.FileNotFoundException;
class H
{
	public static void main(String[] args) throws FileNotFoundException{
		PrintWriter pw= new PrintWriter("abc.txt");

		pw.println("HAve a ni ce day");
		pw.print("have a beautiful day");
		pw.flush();
		//pw.close();
	}
}