package Oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
//To accept data from key Board
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
// How many Subjects
		System.out.println("How many Subjects");
		int n=Integer.parseInt(br.readLine());
//create a 1d array		
int marks[]=new int[n];

//store elements in to an array
for(int i=0;i<n;i++)
{
	System.out.print("Enter Marks:");
marks[i]=Integer.parseInt(br.readLine());
}

//Find Toatal Marks
int tot=0;
for(int i=0;i<n;i++){
	tot +=marks[i];
}
		//Display total marks
System.out.println("Total marks are:" +tot);

	}

}
