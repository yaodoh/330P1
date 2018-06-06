
package p1Pkge;

import java.io.IOException;
import java.util.*;

public class P1Main {
	
	private static final Scanner stdin = new Scanner(System.in); 
	
	public static void main(String [] args) throws IOException
	{
		
		String fileName;
		System.out.println("Enter File Name:  ");
		fileName = stdin.nextLine();
		Output output = new Output(fileName);
		Lexer lexer = new Lexer(fileName, output);
		
		Format format = new Format(lexer, output);
		
		format.file();
		lexer.close();
		output.close();
	}

}
