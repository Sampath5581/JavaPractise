package Javainterviewprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class storeArrayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ar[]=new int[n];
List<Integer> b=new ArrayList();

for(int i=0;i<n;i++)
{
	b.add(sc.nextInt());
}



for(int i=0;i<ar.length;i++)
{
	System.out.println(b.get(i));

	}

}
}