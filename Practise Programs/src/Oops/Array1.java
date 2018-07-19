package Oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array1 {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		
		//read the data from system
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		// Total no of subjects
		System.out.println("Total subjects");
		int n=Integer.parseInt(br.readLine());
		
		// Declare a 1 d array
		int marks[]=new int[n];
		
		//Enter individual Marks
		for(int i=0;i<n;i++){
			System.out.println("Enter individual Marks");
			marks[i]=Integer.parseInt(br.readLine());
		}
		
		//Total marks
		int total=0;
		for(int i=0;i<n;i++){
			total +=marks[i];
			
		}
		
		System.out.println("Total marks are" + total);
	}

}
