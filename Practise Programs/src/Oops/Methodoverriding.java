/*
 * Created on Sep 14, 2017
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Oops;

/**
 * @author sgolyala
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Methodoverriding {
	
static void calculate(double x){
	System.out.println("Square of x is" +(x*x));

}
}

class M2 extends Methodoverriding{
	public static void calculate(double x){
		System.out.println("Square Root of x is" +Math.sqrt(x));
	}
	}


