import java.util.Scanner;

public class Main {
      public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter the number of fibnoci series elements:");
          int n=sc.nextInt();
          fib(n);
      }
      static void fib(int n){
         int a=0,b=1,c;
         System.out.println(a);
          System.out.println(b);
         for(int i=0;i<n-2;i++){
             c=a+b;
             a=b;
             b=c;
             System.out.println(c);

         }
      }
}
