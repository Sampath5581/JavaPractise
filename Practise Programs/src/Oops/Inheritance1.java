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

public class Inheritance1 extends Inheritance {
	public void method3(){
		System.out.println("Child method1");
	}
	public void method4(){
		System.out.println("Child method2");
	}
	
	public static void main(String args[]){
		Inheritance1 In=new Inheritance1();
		In.method3();
		In.method1();
		In.method2();
		In.method4();
						
		}
}
	