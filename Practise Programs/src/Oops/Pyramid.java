/*
 * Created on Oct 3, 2017
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Oops;
import java.util.*;

/**
 * @author sgolyala
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Pyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rc=sc.nextInt();
		int n=1;
		for(int i=rc;i>0;i--){
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n;k++){
				System.out.print(n+" ");
			}
						n++;
						System.out.println();
		}
		
	}
}
