package com.ravi;

public class Inher {

	 String s;
	int j;
	Inher(String s, int j)
	{
		this.s=s;
		this.j=j;
	}
	Inher(Inher ob)
	{
		this.s=ob.s;
		this.j=ob.j;
	}
	Inher(){
		
		
	}
	
	void xyz()
	{
		
		System.out.println(s+j);
		
	}
	
}

class Sub extends Inher{
	
	int g;
	Sub(String s, int j, int g){
		super(s,j);
		this.g=g;
		
	}
	Sub(Sub og){
		super(og);
		this.g=og.g;
		
	}
	void kk() {
	System.out.println(j+""+g);
	
	}
}
