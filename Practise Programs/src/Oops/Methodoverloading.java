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
public class Methodoverloading {
	
public void method1(){
	System.out.println("Method1");
}

public void method1(int i, int j) {
	System.out.println("Method2");
}

public void method2(){
	System.out.println("Parent method3");

}
public void method2(String i, int j){
	System.out.println(i+j+" method3");
	
}

public static void main(String args[]){
	Methodoverloading M=new Methodoverloading();
	M.method1();
	M.method1(10,20);
	M.method2();
	M.method2("Sampath",20);
}}



