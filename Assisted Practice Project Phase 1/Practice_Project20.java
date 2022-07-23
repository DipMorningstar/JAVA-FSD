package filehandling;



class Practice_Project20 extends Exception{
	   String str1;
	   Practice_Project20(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}
	class Example1{
	   public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new Practice_Project20("This is My error Message");
		}
		catch(Practice_Project20 exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	}