public class AssignmentOperator{
public static void main(String args[]){
int a;
int b;
a=20;
b=10;
System.out.println("a="+a);
System.out.println("b="+b);
a+=b;					//same as a=a+b
System.out.println("Addition="+a);	//Addition=30
a-=b;
System.out.println("Subtraction="+a);	//Subtraction=20

a*=b;
System.out.println("Multiplication="+a); 	//Multiplication=200

a/=b;
System.out.println("Division="+a);		//Division=20

a%=b;
System.out.println("Modulus="+a);		//Modulus=0
}
}