package Oops;

import java.io.IOException;

public class Invokebrowser {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = System.getProperty("user.dir");
		System.out.println(path);
		/*String otherFolder = path + "\\geckodriver.exe";*/
		Runtime.getRuntime().exec(path + "/geckodriver.exe");

	}

}
