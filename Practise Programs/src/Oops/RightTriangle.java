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
public class RightTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rc=sc.nextInt();
		for(int i=1;i<=rc;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
				
			}
			
			System.out.println();
		}
			
	}
}
