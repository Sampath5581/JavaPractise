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
public class Abstraction {
private int acc_num;
private String Cus_name;
private float Bal;
private String Address;
private String Bname;

public static void main(String[] aregs){
	Abstraction a=new Abstraction();
	a.acc_num=20;
	System.out.println("Account number is " + a.acc_num);
	System.out.println("Customer name is " + a.Cus_name);
	System.out.println("Balance is "+ a.Bal);
	
	}
}
