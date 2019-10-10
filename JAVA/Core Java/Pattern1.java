public class Pattern1{
public static void main(String args[]){
for(int i=1;i<=4;i++){
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
System.out.println("@@@@@@@@@@@@@@@@@");
for(int l=1;l<=5;l++){
for(int k=1;k<=5-l;k++){
System.out.print("*");
}
System.out.println();
}
int k=1;
for(int x=1;x<=4;x++){
for(int y=1;y<=x;y++,k++){
System.out.print((char)(k+64));
System.out.print((char)(k+96));
}
System.out.println();
}



for(int p=1;p<=4;p++){
int m=p;
for(int q=1;q<=p;q++){
System.out.print(m);
m++;
}
System.out.println();
}

}