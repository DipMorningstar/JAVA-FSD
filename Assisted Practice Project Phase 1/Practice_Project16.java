package filehandling;

public class Practice_Project16 {
	public void ThrowDemo()
	{
		int a=45,b=0,rs;
		try {
			 if(b==0)        
                 throw(new ArithmeticException("Can't divide by zero."));
             else
             {
                 rs = a / b;
                 System.out.print("\n\tThe result is : " + rs);
             }
		}
		catch(ArithmeticException  Ex)
		{
			 {
	                System.out.print("\n\tError : " + Ex.getMessage());
	            }
			 System.out.println("\n\tEnd of Program");
		}
	}
	
	public static void main(String[] args) {
		Practice_Project16 obj=new Practice_Project16();
		obj.ThrowDemo();
	}

}
