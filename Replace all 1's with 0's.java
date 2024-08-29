import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Binary Number To Replace All 0's and 1's:");
        int b=sc.nextInt(),r;
        int i=0,s=0,t=1;
        while(b>0)
        {
            r=b%10;
            if(r==0){
                s=s+1*t;
            }else{
                s=s+((b%10)*t);
            }
            t=t*10;
            b=b/10;
        }
        System.out.println("The changed Number is "+s);
    }
}
