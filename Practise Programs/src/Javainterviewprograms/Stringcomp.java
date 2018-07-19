package Javainterviewprograms;

public class Stringcomp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringcomp v=new Stringcomp();
		v.test("Sampath","Sampath");

	}
public boolean test(String a,String b)
{
if(a==b)
{
	System.out.println("Strings are Same");
	return true;
}
else
{
	System.out.println("Strings are not same");
	return false;
}
}
}
