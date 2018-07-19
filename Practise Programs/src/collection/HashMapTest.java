package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;



public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number of elements");
		int Arr[]={1,2,34,5,6,7,5,32,4,1,9};
				
		TreeMap<Integer,Integer>v=new TreeMap<Integer,Integer>();
				for(Integer c:Arr)
		{
			Integer count=v.get(c);
			if(count==null)
			{
				v.put(c, 1);
				
			}
				else
				{
					v.put(c, ++count);
			}
		}
		
				
		for(int i: v.keySet()){
			System.out.println("Occurence of number " + i + " is " + v.get(i));
		}
		
		/*
		Set<Entry<Integer,Integer>>b=v.entrySet();
		for(Entry<Integer,Integer>n:b)
		{
			System.out.println("Occurence of number " + n.getKey()+ " is " +n.getValue());
		}*/
		
		

	}

}
