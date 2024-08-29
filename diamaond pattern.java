public class main {
    public static void main(String[] args){

        int i,j=0,n=5,s,k;
        s=n-1;
        for(k=0;k<n;k++) {
            for (i = 0; i <s; i++)
                System.out.print(" ");
            for (i = 0; i <= j; i++)
                System.out.print("* ");
            j++;
            s--;
            System.out.print("\n");
        }
        s=0;
        for(k=0;k<5;k++) {
            for (i = 0; i < s; i++)
                System.out.print(" ");
            for (i = 0; i < n; i++)
                System.out.print("* ");
            n--;
            s++;
            System.out.print("\n");
        }

    }
}
