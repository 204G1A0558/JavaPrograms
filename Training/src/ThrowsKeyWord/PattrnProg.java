package ThrowsKeyWord;


import java.util.Scanner;

public class PattrnProg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if((i*j)% (n-1)==0)  //this is aslos a same logoc fpr[.] sqaure and dot in middle
                //if(i==0||j==0||i==n-1||j==n-1||(i==n/2&&j==n/2))
                //it give sthe [\/] shape
                //if(i==0||j==0||i==n-1||j==n-1||i==j||(i+j==n-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
