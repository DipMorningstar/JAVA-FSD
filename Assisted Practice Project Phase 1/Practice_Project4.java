//Default Constructor
class employeeInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

public class constructorDemo {

public static void main(String[] args) {

	employeeInfo emp1=new employeeInfo();
	employeeInfo emp2=new employeeInfo();

	emp1.display();
	emp2.display();
	}
}


class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class paramConstrDemo {
public static void main(String[] args) {

	Std std1=new Std(7,"Vikram");
	Std std2=new Std(14,"Keshab");
	std1.display();
	std2.display();
		}
}

