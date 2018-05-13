import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;

public class append {
	
	public static void main(String[]args){
	
		Scanner s = null;
		try
		{
			s = new Scanner(new FileInputStream("text.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
			System.exit(0);
		}
		while(s.hasNextLine())
		{
			System.out.println(s.nextLine());
		}
		s.close();
	}
}
		
	
		
		/*PrintWriter OutputStreamName = null;
	try
	{
		OutputStreamName = new PrintWriter(new FileOutputStream("test.txt"));
		
	}
	catch (FileNotFoundException e)
	{
		System.out.println(e.getMessage());
		System.exit(0);
	}
	OutputStreamName.println("Hello");
	OutputStreamName.close();

	
	
}
}
	PrintWriter OutputStreamName = null;
	try
	{
		OutputStreamName = new PrintWriter(new FileOutputStream("test.txt", true));
		
	}
	catch (FileNotFoundException e)
	{
		System.out.println(e.getMessage());
		System.exit(0);
	}
	OutputStreamName.println("goodbye");
	OutputStreamName.close();
}
}*/





	
	



	