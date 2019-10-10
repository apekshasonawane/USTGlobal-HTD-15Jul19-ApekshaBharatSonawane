
public class MainClass  {

	public static void main(String[] args) {
		
		FunctionalInt f=()->{
		System.out.println("This is lambda expression");
		};
		MainClass m=new MainClass();
		m.print();	//calling class method using current class object
	f.display();		//default method can be called by using instance of interface
	FunctionalInt.dis();	//calling static method using interface name
	}
	
	public void print() {
		System.out.println("This is print");
		
	}
	
	

}
