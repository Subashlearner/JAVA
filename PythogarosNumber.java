import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check Pythogroas:");
        int n=sc.nextInt();
        int c=0,i,j=0;
        for( i=0;i<n&&c!=n;i++)
        {

            for( j=0;j<n;j++)
            {
                c=(i*i)+(j*j);
                if(c==n){
                    break;
                }
            }
        }
        if(c==n){
            System.out.println(i-1+ "  "+"and  "+j+"  "  +"are the two numbers ");
        }else {
            System.out.println("the number not statusfy the pythogoras");
        }

    }
}
