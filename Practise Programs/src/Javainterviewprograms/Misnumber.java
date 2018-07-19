package Javainterviewprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Misnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the total number of elements");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=1;
int arr[]=new int[n];
System.out.println("Enter the elements");
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
Arrays.sort(arr);
ArrayList<Integer>o=new ArrayList<Integer>();
for(int i=0;i<arr.length;i++){



if(count==arr[i]){
	count++;
	continue;
}
else {
	o.add(count);
	i--;
	count++;
	
}
	
	}
System.out.println(o);
}}



