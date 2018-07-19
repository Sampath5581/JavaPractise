package Javainterviewprograms;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=1;
		int c;
		int n=10;
		System.out.print(a+" " +b);
		for(int i=0;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
			
		}
			
		

}
}
