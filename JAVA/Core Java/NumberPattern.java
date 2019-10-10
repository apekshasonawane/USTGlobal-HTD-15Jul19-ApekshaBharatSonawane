public class NumberPattern{
public static void main(String args[]){
int i,j,n=4,diff,value;

     for(i=1;i<=4;i++)
     {
 diff=n-1;
 value=i;
        for(j=1;j<=i;j++)
         {
             System.out.printf("%4d", value);
         value=value+diff; 
             diff--;
         } 
         System.out.println("");
     }
}
}