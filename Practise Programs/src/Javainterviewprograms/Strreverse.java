package Javainterviewprograms;

public class Strreverse {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Strreverse st=new Strreverse();
			st.reverseString("Sampath");
			
			
		}
	public void reverseString(String name){
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.print(rev);
	
		
	}
	
}

/*
// 2. using String Buffer class
StringBuffer sb=new StringBuffer(s);

System.out.println(sb.reverse());

		

}	

}		
		*/
		
		
		
		
		
		

