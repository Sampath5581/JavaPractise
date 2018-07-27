package Javainterviewprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,2,5,6,5,8,9,8,3,1};
		
		Arrays.sort(arr);
		
		
		for(Integer b:arr)
		{
			System.out.print(b);
		}
		
		Map<Integer,Integer> h=new HashMap<Integer,Integer>();
		
		for(Integer v:arr)
		{
			Integer count=h.get(v);
		if(count==null)
		{
			h.put(v,1);
		}
		else {
			h.put(v, ++count);
		}
		}
		
	Set<Entry<Integer,Integer>> b=h.entrySet();
	for(Entry<Integer,Integer>l:b){
		System.out.println();
		System.out.println(l.getKey()+ " ==> "+ l.getValue());
	}
		

	}

}
