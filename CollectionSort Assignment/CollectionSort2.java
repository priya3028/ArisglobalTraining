//LINKED LIST

import java.util.*;
public class CollectionSort2 {

	public static void main(String[] args) 
	{	
		// TODO Auto-generated method stub
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Priya");  
		al.add("Dohita");  
		al.add("Aarav");  
		al.add("Kiara");  
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  
		

	}

}
