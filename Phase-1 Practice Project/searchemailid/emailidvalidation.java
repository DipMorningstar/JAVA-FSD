package searchemailid;
import java.util.*;
public class emailidvalidation {

	
	public static void main(String args[])
	{
		 ArrayList<String>emailid=new ArrayList<String>();
		 emailid.add("jack@gmail.com");
		 emailid.add("jhonny@yahoo.com");
		 emailid.add("arjun@gmail.com");
		 String emailID;
		 System.out.println("Enter your email id:");
		 Scanner em=new Scanner(System.in);
		 emailID=em.nextLine();
		if(emailid.contains(emailID))
		{
			 System.out.println("email Id: " + emailID + " found");
		}
		else 
		{
	      System.out.println("email Id: " + emailID + " not found");
		}
		 
	}
}
