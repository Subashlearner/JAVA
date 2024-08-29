import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to check the armstrong or not:");
        int a=sc.nextInt();
        armstrongnum(a);

    }
    static void armstrongnum(int a){

      int x=a ;
      double s=0;
      int q,l;
      l=String.valueOf(x).length();
      while(x>0){
          q=x%10;
          s=s+Math.pow(q,l);
          x=x/10;
      }
      if(s==a)
          System.out.println("the given number is Armstrong");
      else
          System.out.println("the given number is Not an Armstrong");

    }
}
