package Oops;

public class fibonacci {
	public static void main(String[] args) {
	    {
	        int n=9, a = 0, b = 1, c, i=1;
	    
	     /*   for (int i = 1; i <= n; i++)
	        {
	        	System.out.print(a + " ");
	            c = a + b;
	            a = b;
	            b = c;
	        }*/
	        while(i<=n){
	        	System.out.print(a + " ");
	            c = a + b;
	            a = b;
	            b = c;
	            i++;
	        	
	        }
	    }
	}
}
	
		


