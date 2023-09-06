package Day91FileOps3;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("C:/JavaFiles/inputOutput");
		
		String content = "Hello! My name is Harry"
				+ "I am a public speaker"
				+ "I also like cooking";
		
		FileOutputStream otf = new FileOutputStream(f);
		DataOutputStream outstream = new DataOutputStream(new BufferedOutputStream(otf));
		
		outstream.writeUTF(content);
		outstream.close();
		
		String result;
		FileInputStream itf = new FileInputStream(f);
		DataInputStream read = new DataInputStream(itf);
		
		result = read.readUTF();
		read.close();
		System.out.println("The content written in file are: ");
		System.out.println(result);
		
		
		
		

	}

}
