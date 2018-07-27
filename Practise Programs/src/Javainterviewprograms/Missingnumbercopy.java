package Javainterviewprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Missingnumbercopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={1,5,6,7,9,2};
ArrayList b=new ArrayList();


int count=1;
Arrays.sort(arr);

for(int i=0;i<arr.length;i++)
{
	
	if(count==arr[i])
	{
		count++;
		continue;
	}else
	{
		//arr1[b]=count;
		b.add(count);
		i--;
		count++;
	}
}
System.out.println(b);
	}

}
