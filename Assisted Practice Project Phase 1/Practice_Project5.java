import java.util.*;

public class collectionHelp
{

	public static void main(String[] args)
 	{
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Mumbai");
	      city.add("Goa");    	   
	      System.out.println(city);  
		
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(20); 
	      vec.addElement(60); 
	      System.out.println(vec);
		
	      System.out.println("\n");
	      System.out.println("Linkedlist");
	      Linkedlist<String> names=new Linkedlist<String>();  
	      names.add("Rohit");  
	      names.add("Ritesh");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	      
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(201);  
	       set.add(202);  
	       set.add(203);
	       set.add(204);
	       System.out.println(set);
	       
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 
	      }  
	}
