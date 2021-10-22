//TREE SET

import java.util.*;
public class CollectionSort5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeSet<String> set=new TreeSet<String>();  
		set.add("Priya");  
		set.add("Kiara");  
		set.add("Aarav");  
		set.add("Kiara");  
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  
	}

}
