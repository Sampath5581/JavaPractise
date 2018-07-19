package Oops;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a = new ArrayList<>();
		a.add("SaiKrishna Das");
		a.add("Prathyusha");
		a.add("Sunil");
		
		//display the contents of array
		
		System.out.println("Array list are" +a);
		
		//remove elements from an array
		
		a.remove("Prathyusha");
		
		a.remove(0);
		
		System.out.println("Array list are" +a);
		
		//know the elements in A1
		System.out.println("No of elements" +a.size());
				
	
		
		

	}

}
