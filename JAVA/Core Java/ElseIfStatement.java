import java.util.Scanner;


public class ElseIfStatement{
public static void main(String args[]){
int marks;
System.out.println("Enter marks=>");
Scanner sc=new Scanner(System.in);

marks=sc.nextInt();
if(marks>=91 && marks<=100)
System.out.println("Grade A");
else if(marks>=81 && marks<=90)
System.out.println("Grade B");
else if(marks>=71 && marks<=80)
System.out.println("Grade C");
else if(marks>=61 && marks<=70)
System.out.println("Grade D");
else if(marks>=51 && marks<=60)
System.out.println("Grade E");
else if(marks>=41 && marks<=50)
System.out.println("Retest");
else if(marks<=40 && marks>=0)
System.out.println("fail");

else
System.out.println("invalid marks");

}
}