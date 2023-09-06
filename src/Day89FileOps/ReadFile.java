package Day89FileOps;

import java.io.File;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			//Creating file in a specific folder
			File f = new File("C://JavaFiles/hari.txt");
			Scanner sc = new Scanner(f);
			System.out.println("Data from file");
			while(sc.hasNextLine())
			{
				String fileData = sc.nextLine();
			
				System.out.println(fileData);
			}
			sc.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}

	}

}
