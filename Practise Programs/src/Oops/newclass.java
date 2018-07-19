package Oops;

public class newclass {

	void Calculate(double x){
	}
	
public static void main(String[] args) {
	
	sub1 obj1=new sub1();
	sub2 obj2=new sub2();
	obj1.Calculate(2);
	obj2.Calculate(25);
}
	
}// TODO Auto-generated method stub
		class sub1 extends newclass{
			 void Calculate(double x)
			{
				System.out.println("Square of" +(x*x));
			}
		}
		class sub2 extends newclass{
			 void Calculate(double x)
			{
				System.out.println("Squart of" +Math.sqrt(x));
			}
	
		
	}

