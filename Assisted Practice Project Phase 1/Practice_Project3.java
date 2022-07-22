import java.util.*;
public class methodExecution
{

public int multipynumbers(int b,int c) 
{
	int a=b*c;
	return a;
}

public static void main(String[] args)
 {

	methodExec y=new methodExec();
	int ans= y.multipynumbers(5,7);
	System.out.println("Multipilcation is :"+ans);
	}

public class call_Method 
{
int value=150;
int operation(int value) 
{
	value =value*10/100;
	return(value);
}

public static void main(String args[]) {
	call_Method d = new call_Method();
	System.out.println("Before operation value of data is "+d.value);
	d.operation(100);
	System.out.println("After operation value of data is "+d.value);
	}
}

public class overload_Method 
{
	public void area(int b,int h)
    	{
         System.out.println("Area of Triangle :- "+(0.5*b*h));
    	}
   	 public void area(int r) 
   	{
         System.out.println("Area of Circle :- "+(3.14*r*r));
    	}

    public static void main(String args[])
   {

overload_Method ob=new overload_Method();
       ob.area(4,6);
       ob.area(8);  
   }
}
