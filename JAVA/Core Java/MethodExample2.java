public class MethodExample2{


public static void  main(String args[]){
 areaOfTriangle(10,5);
 areaOfCircle(2);
 averageOfNumbers(10,20,30);

}
public static void areaOfTriangle(int length,int height){
System.out.println("Area of Triangle=>"+0.5*length*height);

}
public static int  areaOfCircle(int radius){
return (22/7)*radius*radius;
}

public static void averageOfNumbers(int a,int b,int c){
System.out.println("Average of 3 numbers=>"+((a+b+c)/3));
}


}