package com.ravi;

public class Add {
	
	public int a=5;
	public int b=10;
	public int c=10;
 int add(int x, int y)

{
int sum=x+y;
return sum;

}
public static void main(String args[]) {
	
	
	Add ad=new Add();
	
	System.out.println(ad.a);
	System.out.println(ad.b);
	System.out.println(ad.add(5,8));
}
}


