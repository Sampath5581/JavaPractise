package Oops;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=141;//given number
		int y=0;//initialization
		int z=x;
		
		while(x!=0){
			int r;
			r=x%10; //r=1,4
			y=y*10+r;//y=1
			x=x/10;//x=14
			
		}
System.out.println("Palindrom of y is "+ y);
if(z==y){
	System.out.println("It is a palindrom");
}
	else{
		System.out.println("It is not a palindrom");
}
	}

}
