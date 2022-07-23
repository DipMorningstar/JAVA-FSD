package filehandling;

public class Practice__Project19 extends Exception {
	 public Practice__Project19(String s) 
	    { 
	        super(s); 
	    } 
	} 
	public class Main 
	{ 
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            throw new Practice__Project19("temp"); 
	        } 
	        catch (Practice__Project19 ex) 
	        { 
	            System.out.println("Caught"); 
	            System.out.println(ex.getMessage()); 
	        } 
	    } 

}
