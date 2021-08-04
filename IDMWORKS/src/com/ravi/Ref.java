package com.ravi;

interface Ref {

	
	void kk();
}

class Gef implements Ref{
	
	void jj()
	{System.out.println("jj");
		
	}
	void mm() {
		
		System.out.println("mm");
	}
	@Override
	public void kk() {
		System.out.println("kk");
		
	}
	
}
