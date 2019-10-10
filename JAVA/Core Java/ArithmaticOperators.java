public class ArithmaticOperators{
public static void main(String args[]){
int i=20,j=30;
int res=i+j;
System.out.println("Addition="+res);			//addition
res=i-j;						//reinitialization of res variable
System.out.println("Subtraction="+res);		//subtraction
res=i*j;						//reinitialization of res variable
System.out.println("Multiplication="+res);		//multiplication
System.out.println("Division="+(i/j));			//Division
System.out.println("Remainder="+(i%j));			//modulus

float a=28.43f,b=22.234f;
System.out.println("Addition="+(a+b));
System.out.println("Subtraction="+(a-b));
System.out.println("Multiplication="+(a*b));
//System.out.println("Division="+(a/b));
//System.out.println("Remainder="+(a%b));

char c1='A',c2='B';
System.out.println(c1+c2);				//Adds ascii value of characters
int a1=65;
char c3='A';
System.out.println(a1+c3);				//Adds integer and ascii value of character 


}
}