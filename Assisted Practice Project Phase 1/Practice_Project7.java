public class innerClassHelp1 
{

	 private String msg="Welcome to Programming World"; 
	 
	 class Inner
	{  
	  void hello(){System.out.println(msg+", Start Learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		innerClassHelp1 obj=new innerClassHelp1();
		innerClassHelp1.Inner in=obj.new Inner();  
		in.hello();  
	}
}


public class innerClassHelp2
{

private String msg="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) 
	{
	innerClassHelp2  ob=new innerClassHelp2();  
	ob.display();  
	}
}

abstract class AnonymousInnerClass {
	   public abstract void display();
	}


	public class innerClassHelp3 {

	public static void main(String[] args) {
	AnonymousInnerClass i = new AnonymousInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	   }
	}
