/*
 * Created on Sep 27, 2017
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Oops;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

/**
 * @author sgolyala
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class classarr {

	public static void main(String[] args) throws IOException{
		
		// to accept data from keyboward
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//create Employee type arr with size 5
		employeearr arr[]=new employeearr[2];
		 //store 5 employee's data in to an array
		for (int i=0;i<2;i++)
		{
			System.out.println("Enter id:");
			int a=Integer.parseInt(br.readLine());
			
			System.out.println("Enter name:");
			String n=br.readLine();
			arr[i]=new employeearr(a,n);
					}
		System.out.println("The employee data is : ");
		
		// display the employee data from the array
		for(int i=0;i<arr.length;i++)
		{
			arr[i].display();
		}
		
		}
		}
