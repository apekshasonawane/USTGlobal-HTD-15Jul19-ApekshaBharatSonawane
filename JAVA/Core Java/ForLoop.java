import java.util.Scanner;
public class ForLoop{					//if we give public then compiler will come to know this class name and filename is same dusring creation of class file
public static void main(String args[]){
int i,num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
num=sc.nextInt();
//for(i=1;i<=10;i++){
//System.out.println("i="+i);
//}
System.out.println("Table of  "+num+ "   is as follows=>");
for(i=1;i<=10;){
System.out.println(num*i);
i++;
}
for(;;){
System.out.println(i);   //ForLoop.java:19: error: unreachable statement
                         // System.out.println("Outside of For");
                         //  ^
                         //1 error
}
System.out.println("Outside of For");
}

}