import java.util.Scanner;

public class Main {
 public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the railway Hour time:");
     int h=sc.nextInt();
     System.out.println("Enter the Railway mins:");
     int m=sc.nextInt();
     int uh,um=m;
     if(h>12||h==0)
     {
         uh=h-12;
         System.out.println(uh+":"+um+"PM");
     }
     else{
         uh=h;
         System.out.println(uh+":"+um+"AM");
     }



 }
}
