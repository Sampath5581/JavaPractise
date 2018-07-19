/*
 * Created on Sep 18, 2017
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

interface Myinter
{
	
	void add();
	void subtract();
} 

class one implements Myinter{
	int x=10,y=20;
	public void add(){
		
		System.out.println("Addition of 2 numbers are "+ (x+y));
}
	public void subtract(){
		System.out.println("subtraction of 2 numbers are " +(x-y));
	}
}

class two implements Myinter{
	int x=60,y=30;
	public void add(){
		System.out.println("Addition of 2 numbers are "+ (x+y));
}
	public void subtract(){
		System.out.println("subtraction of 2 numbers are " +(x-y));
	}
}