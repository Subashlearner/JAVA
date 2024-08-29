import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to find the factorial:");
        int n=sc.nextInt();
        fact(n);
    }
     static void fact(int x){
        int f=1;
        while(x>1){
            f=f*(x);
            x=x-1;
        }
         System.out.print("factorial of the number :"+f);
     }
}
