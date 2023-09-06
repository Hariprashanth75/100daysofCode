package Day90FileOps2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateAndWriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File f = new File("C:/JavaFiles/myFile.txt");
			if(f.createNewFile())
			{
				System.out.println("New file is created! " + f.getName() + " on path "+ f.getPath());
				
				String str = "Hello I am the content written by java on this file";
				BufferedWriter writer = new BufferedWriter(new FileWriter(f));
				writer.write(str);
				writer.close();
				
				
				Scanner sc = new Scanner(f);
				System.out.println("Now let me show you the contents of the file: ");
				while(sc.hasNextLine())
				{
					String filedata = sc.nextLine();
					System.out.println(filedata);
				}
				sc.close();
				
				
			}
			else
			{
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
