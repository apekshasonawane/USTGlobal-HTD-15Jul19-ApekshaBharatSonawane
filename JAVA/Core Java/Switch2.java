import java.util.Scanner;

public class Switch2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int day=4;
System.out.println("Enter day:");
day=sc.nextInt();
switch(day){
case 1:
case 2:
case 3:
case 4:
case 5:
System.out.println("Weekday");
break;
case 6:
case  7:
System.out.println("Weekend");
break;
default:System.out.println("Invalid number");
}



}
}