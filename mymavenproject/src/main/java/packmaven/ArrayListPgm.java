package packmaven;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPgm {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Nithya");
		al.add("Dev");
		al.add("Arya");
		al.add("Basim");
		System.out.println(al);
		 
		
		String a=al.get(2);
		System.out.println(a);
		Boolean b=al.contains("Jinta");
		System.out.println(b);
		int length=al.size();
		System.out.println(length);
		al.remove(3);
		System.out.println(al);
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
		System.out.println(s);
		}
		
		for(String c:al)
		{
			System.out.println(c);
		}
		
		int d[]= {10,20,30,40};
		for(int i:d)
		{
			System.out.println(i);
		}
	}

}
