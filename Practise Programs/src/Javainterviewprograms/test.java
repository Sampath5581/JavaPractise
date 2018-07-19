package Javainterviewprograms;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,5,3,9,4,8,0,2};
		int largest=arr[0];
		int slargest=arr[0];
		for(int i=0;i<arr.length;i++){
			if (arr[i]<largest){
				slargest=largest;
				largest=arr[i];
				
			}
			else if(arr[i]<slargest){
				slargest=arr[i];
			}
			
		}
		System.out.println("Second largest number is:"+slargest);
	}

}
