public class LogicalOperators{
public static void main(String args[]){
boolean b1=true;
boolean b2=false;
boolean b3=false;
boolean b4=true;
System.out.println(!b1);			//returns false
System.out.println(!b2);			//returns true
System.out.println(b1 || b2);			//returns true
System.out.println(b2 || b3);			//returns false
System.out.println(b1 && b4);			//returns true
System.out.println(b1 && b3);			//returns false
System.out.println(!(b1 && b3));			//returns true


}
}