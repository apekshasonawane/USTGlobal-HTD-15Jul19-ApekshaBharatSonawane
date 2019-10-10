import java.util.Scanner;

public class SwitchStatement{
public static void main(String args[]){
int day;
Scanner sc =new Scanner(System.in);
System.out.println("Enter number to see day:");
day=sc.nextInt();
switch(day)
{
case 1:
System.out.println("Its Sunday");
break;
case 2:
System.out.println("Its Monday");
break;
case 3:
System.out.println("Its Tuesday");
break;
case 4:
System.out.println("Its Wednesday");
break;
case 5:
System.out.println("Its Thursday");
break;
case 6:
System.out.println("Its Friday");
break;
case 7:
System.out.println("Its Saturday");
break;
default:
System.out.println("Invalid number");
break;
}

}
}