package com.ravi.shaw;
import java.util.*;  
public class Collection {

	public static void main(String args[]){  
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());   
	}  
	}  
  
	}
