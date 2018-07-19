package Javainterviewprograms;

public class InterfaceTest  implements InterafaceDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterafaceDemo id = new  InterfaceTest();
		
		id.display();
		id.display(1, "abc");
		id.display("abc", 1);
		
		System.out.println(authentication_token);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Display with no arg");
		
	}

	@Override
	public void display(int num, String str) {
		System.out.println("Display with 2 normal arg");
		
	}

	@Override
	public void display(String str, int num) {
		System.out.println("Display with reverse arg");
		
	}

}
