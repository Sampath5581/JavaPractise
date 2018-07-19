
package Oops;

abstract class abstractclass {
	abstract void calculate(int x);

}
class sub5 extends abstractclass
{
	void calculate(int x)
	{
		System.out.println("Square root of x is "+Math.sqrt(x));
	}
}

class sub6 extends abstractclass
{
		void calculate(int x)
	{
		System.out.println("Square of x is "+(x*x));
	}
}


