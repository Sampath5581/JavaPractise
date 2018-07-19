package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MissingnumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Set<Integer>b=new TreeSet<Integer>();
System.out.println("Enter the Total number of elements");
int n=sc.nextInt();
System.out.println("Enter the Elements");
for(int i=0;i<n;i++)
{
	
	b.add(sc.nextInt());
}
	
System.out.println(b);
int count=1;
ArrayList<Integer>s=new ArrayList<Integer>(b);
ArrayList<Integer>r=new ArrayList<Integer>();

for(int i=0;i<s.size();i++){

if(count==s.get(i))
{
	count++;
	continue;
	
}
else {
	r.add(count);
	i--;
	count++;
}

}
System.out.println("Missing Numbers are"+r);

	}}