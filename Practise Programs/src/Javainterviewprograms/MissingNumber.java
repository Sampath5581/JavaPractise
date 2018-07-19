package Javainterviewprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		// TODO Auto-generated method stub
//int arr[]={3,5,7,4};
Arrays.sort(arr);
int count=1;
ArrayList g=new ArrayList();
for (int i = 0; i < arr.length; i++) {
	if(count==arr[i]){
		count++;
		continue;
			
	}
	else{
		g.add(count);
		i--;
		
		count++;
		
	}
	
}
System.out.println(g);
	}

}
