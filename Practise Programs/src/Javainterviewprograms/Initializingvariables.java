package Javainterviewprograms;



public class Initializingvariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Initializingvariables in=new Initializingvariables();
		talka k=new talka();
		k.talk("Sampath",22);
	
		
	}
}
	class talka{
		/*String name;
		int age;*/
		public void talk(String name,int age){
			System.out.println("Name is"+name);
			System.out.println("age is"+age);
			
		}
		
	}

