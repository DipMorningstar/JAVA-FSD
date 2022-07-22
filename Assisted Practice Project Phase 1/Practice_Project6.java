import java.util.*;
public class mapDemo {

	public static void main(String[] args) {
	
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Raaj");    
	      hm.put(2,"Nehal");    
	      hm.put(3,"Sweta");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Hitesh");  
	      ht.put(5,"Mukti");  
	      ht.put(6,"Trashi");  
	      ht.put(7,"Sandeep");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }

	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Esha");    
	      map.put(9,"Sweety");    
	      map.put(10,"Saarath");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}

