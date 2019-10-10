public class IncrementDecrementOperator{
public static void main(String args[]){
int i=10;
int j=++i;  				//increment,substitute,utilize
System.out.println(j); 			//i will be 11
j=i++;					//substitute,utilize,increment
System.out.println(j); 			//i will be 12

int a=20;
int b=a--;			//substitute,utilize,decrement
System.out.println(b);		//b will be 20 and a will be 19
b=--a;				//decrement,substitute,utilize    a will be 19
System.out.println(b);		//b will be 18



}
}