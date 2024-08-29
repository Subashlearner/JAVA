import java.util.Scanner;
public class Main {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number and string to reverse:");
        int num=sc.nextInt();
        String str=sc.nextLine();
        reversenum(num);
        reversestr(str);

    }
    static void reversenum(int c){
        int n=c;
        int r=0,q;
        while(n!=0){
            q=n%10;
            r=r*10+q;
            n=n/10;
        }
        System.out.print("reverse a number is:"+r);


    }
    static void reversestr(String s)
    {
        String rs="";
        int n=s.length();
        for(int i=n-1,j=0;i>=0;i--,j++){
            rs=rs+s.charAt(i);
        }
        System.out.print("reverse a string:"+rs);
    }
}
