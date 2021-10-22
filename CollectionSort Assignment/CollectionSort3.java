//HASHSET


import java.util.*;
public class CollectionSort3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();  
		set.add("Priya");  
		set.add("Dohita");  
		set.add("Aarav");  
		set.add("Priya");  
		
		Iterator<String>itr=set.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  
	}

}
