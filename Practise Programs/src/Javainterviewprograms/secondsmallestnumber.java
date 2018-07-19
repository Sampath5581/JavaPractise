package Javainterviewprograms;

public class secondsmallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 14, 03,02,06, 47, 86, 92, 52, 48, 05, 66, 85 };
		int smallest=arr[0];
		int secondsmallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest){
				secondsmallest=smallest;
				smallest=arr[i];
						
			}
			else if(arr[i]<secondsmallest){
				secondsmallest=arr[i];
			}
				
			}
		System.out.println("Secondsmallest number is:"+secondsmallest);
		System.out.println("smallest number is:"+smallest);
		
		}
	}




