package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class scannerinputoccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number of elements");
		 int n =sc.nextInt();
		 int Arr[]= new int[n];//{1,2,34,5,6,7,5,32,4,1,9};
		 System.out.println("Enter the elements");
		 for(int i=0;i<n;i++)
		 {
			 Arr[i]=sc.nextInt();
		 }
		 Arrays.sort(Arr);
		 HashMap<Integer,Integer>b=new HashMap<Integer, Integer>();
		for(Integer c:Arr)
		 {
		 Integer count=b.get(c);
		 if(count==null)
		 {
			 b.put(c, 1);
		 }
		 else
		 {
			 b.put(c, ++count);
		 }
		 }
		Set<Entry<Integer,Integer>>v=b.entrySet();
		for(Entry<Integer,Integer> j:v){
			if(j.getValue()>1){
				System.out.println(j.getKey()+"" +j.getValue());//To print only duplicate keys and values with their occurence
			}
		//System.out.println(j.getKey()+"" +j.getValue());// To print all keys and values with their occurences
			
		}
		
	
		 }

}
