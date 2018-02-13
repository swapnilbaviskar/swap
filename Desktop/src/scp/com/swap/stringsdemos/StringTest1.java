package scp.com.swap.stringsdemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StringTest1 {
	public static void main(String[] args) {
		String str = new String("Swapnil");
		System.out.println(str);
		String str1 = str.concat("Rick");	//concat two string
		//System.out.println(str1);
		//char[] ar1=str1.toCharArray();		// using array to find length
		//System.out.println(ar1.length);
		
	
	
	/**
	 * @author Swapnil
	 * 1. Reverse string using the charater array.
	 * 
	 * 2. Reverse string  using string buffer.
	 * 
	 * 3. Reverse string  using string builder. 
	 * 
	 * 4. Reverse string  using for loop.
	 * 
	 * 5. Reverse string  using arraylist object
	 */
		
		/*char[] ar1= str.toCharArray();
		for (int i=ar1.length-1; i>=0; i--) {
			System.out.print(ar1[i]);
		}
		*/
		
		
		/*
		 * StringBuffer sb= new StringBuffer(str);		//Reverse string  using string buffer.
		 * sb.reverse();
		 *System.out.println(sb);
		 */
		
		
		/*StringBuilder sb= new StringBuilder(str);		//Reverse string  using string builder 1.
		sb.reverse();
		System.out.println(sb);*/
		
		/*String s = new StringBuilder(str).reverse().toString();   //Reverse string  using string builder 2.
		System.out.println(s);*/
		
		/*System.out.println(new StringBuilder(str).reverse().toString());		//Reverse string  using string builder 3.
		*/
		
		/*for (int i = str.length()-1 ; i>=0; i--) {		//Reverse string  using for loop.
			System.out.print(str.charAt(i));
			
		}*/
		
		char[] array = str.toCharArray();
		/*List<Character> al =  new ArrayList();
		for (Character character : array) {
			al.add(character);
			
		}
		Collections.reverse(al);
		Iterator itr= al.iterator();  ----------> Iterator used the perticular output
		while (itr.hasNext()) {
			System.out.print(itr.next());
			
		}*/
		//System.out.println(al);
	
		/*Stack<Character> al =  new Stack<>();
		for (Character character : array) {
			al.push(character);
			
		}
		Collections.reverse(al);
		Iterator itr= al.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
			
		}*/
		
		
		/*List<Character> ls =  new LinkedList<>();
		for (Character character : array) {
			ls.add(character);
			
		}
		Collections.reverse(ls);
		System.out.println(ls);
		*/
		
		Vector<Character> vl =  new Vector<>();
		for (Character character : array) {
			vl.add(character);
			
		}
		Collections.reverse(vl);
		System.out.println(vl);
		
		
		}
		
	

}