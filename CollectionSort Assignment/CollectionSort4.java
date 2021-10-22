//LINKEDHASHSET


import java.util.*;
public class CollectionSort4 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("Priya");  
		set.add("Dohita");  
		set.add("Aarav");  
		set.add("Dohita");  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  
	}

}
