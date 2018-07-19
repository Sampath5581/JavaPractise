package Javainterviewprograms;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={15,3,5,9,25,86,54,38,16,69};
int largest=arr[0];
int secondlargest=arr[0];
for(int i=0;i<arr.length;i++){
	if(arr[i]>largest){
		secondlargest=largest;
		largest=arr[i];
	}
	else if(arr[i]>secondlargest){
		secondlargest=arr[i];
	}
}
System.out.println("Largest number is:"+largest);		
System.out.println("Second Largest number is:"+secondlargest);
	}
}
						
						
				
				

