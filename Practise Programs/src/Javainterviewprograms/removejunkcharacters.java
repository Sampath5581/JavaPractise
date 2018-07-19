package Javainterviewprograms;

public class removejunkcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="gdtyfatfc#$%+ =cbha 1245";
		// we can remove junk values by using regular expression[^a-zA-Z0-9] i.e., replaceall method
	s=s.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s);

	}

}
