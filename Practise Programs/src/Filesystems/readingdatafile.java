package Filesystems;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readingdatafile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fi=new FileInputStream("abc.txt");
System.out.println("File contents");
int ch;
while((ch=fi.read())!=-1)
	System.out.print((char)ch);
fi.close();
	}

}
