package Javainterviewprograms;

public class reversethenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using algorithm
		int c=141;
		int n=c;
		int rev=0;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
			
		}
System.out.println("reverse of the number is :" +rev);

// using String Buffer
if(rev==c)
{
	System.out.println("Given number is a plaindrom");
	}
else
	System.out.println("Given number is not a palindrom");
/*int num1=3716427;
System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
*/

	}

}
