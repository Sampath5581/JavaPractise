package Filesystems;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStrream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Read the data from keyboard
		
		DataInputStream dis=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("D:/cafe_cbf/Practise Programs/1abc.txt");
		System.out.println("Enther the text(@ at the end):");
		char ch;
		while((ch=(char)dis.read()) !='@')
			fout.write(ch);
		fout.close();
		

	}

}
