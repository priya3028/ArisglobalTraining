
//ARRAY LIST


import java.util.*;  
class CollectionSort1
{  
	public static void main(String args[])
	{  
		ArrayList<String> list=new ArrayList<String>();
		list.add("Priya"); 
		list.add("Dohita");  
		list.add("Aarav");  
		list.add("Kiara");  

		Iterator itr=list.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  
	}  
}  



