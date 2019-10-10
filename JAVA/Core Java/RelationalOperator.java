public class RelationalOperator{
public static void main(String args[]){
int a=20;
int b=30;
int c=20;
char c1='A';
char c2='B';
int d=65;
System.out.println("==  "+(a==b)); 				//returns false
System.out.println("!=  "+(a!=b));	 			//returns true
System.out.println("== "+ (a==c)); 				//returns true
boolean b1=a>b;
System.out.println(">  "+b1);					//returns false
System.out.println("<  "+(a<b));				//retruns true
System.out.println("<=  "+(a<=c));				//returns true
System.out.println("<=  "+(a>=b));				//returns false
System.out.println("int and char  "+(a==c1));			//returns false
System.out.println("int and char  "+(d==c1));			//returns true(compare ascii values of integer and character)
System.out.println(c1>c2);					//returns false


}
}