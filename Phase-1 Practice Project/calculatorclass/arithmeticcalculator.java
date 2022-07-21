package calculatorclass;

import java.util.Scanner;

public class arithmeticcalculator {
	
	Scanner sc=new Scanner(System.in);

	int a=sc.nextInt();
		int b=sc.nextInt();
	public int add()
	{
		
		return (a+b);
	}
	public float divide()
	{
		float c=(int) a;
		float d=(int) b;
		return(a/b);
	}
	public int multiply() {
		return(a*b);
	}
public int subtract()
{
	return (a-b);
	
}
public static void main(String args[])
{
	arithmeticcalculator obj=new arithmeticcalculator();
	int addresult=obj.add();
	System.out.println(addresult);
	float divideresult=obj.divide();
	System.out.printf("%.3f",divideresult);
	int resultmultliply=obj.multiply();
	System.out.println(resultmultliply);
	int resultsubtract=obj.subtract();
	System.out.println(resultsubtract);
}
}
