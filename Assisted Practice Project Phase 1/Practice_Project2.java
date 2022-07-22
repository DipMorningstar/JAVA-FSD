// Class is having Default access modifier 
class A
{ 
  void display() 
     { 
         System.out.println("Using defalut access specifier"); 
     } 
} 

public class B {

	public static void main(String[] args) {
		
		System.out.println("Dafault Access Specifier");
		A obj = new A(); 		  
        obj.display(); 

	}
}


// using private access specifiers
class C 
{ 
   private void display() 
    { 
        System.out.println("using private access specifier"); 
    } 
} 

public class D {

	public static void main(String[] args) {
		
		System.out.println("Private Access Specifier");
		C  obj = new C(); 
        
        

	}
}


using protected access specifiers
package pack1;

public class proaccessspecifiers {

	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}

package pack2;

import pack1.*;

public class E extends proaccessspecifiers {

	public static void main(String[] args) {
		E obj = new E ();   
	       obj.display();  
	}

}






//using public access specifiers
package pack1;

public class pubaccessspecifiers {

	public void display() 
    { 
        System.out.println("This is Public Access Specifiers"); 
    } 
}

package pack2;
import pack1.*;

public class F {

	public static void main(String[] args) {
		
		pubaccessspecifiers obj = new pubaccessspecifiers(); 
        obj.display();  
		
	}
}
