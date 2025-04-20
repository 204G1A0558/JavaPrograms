package ThrowsKeyWord;

public class PatternProgNew {
    public static void main(String[] args) {
        int n = 10;
        //instead of space and sstar we can give direclry as
        //int space=n-1, star=1;
        // we can remove 2 for lopps
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + i; j++) {
                if (j < n - i - 1)
                    System.out.print(" ");
                else {
                    System.out.printf("%d",i);
                    //System.out.print(j-(n-i-1));
                    //System.out.print("*");

                }
//            for(int j=0;j<n-i-1;j++)
//                System.out.print(" ");
//            for(int j=0;j<2*i+1;j++)
//                System.out.print("*");
                //space--;
                //star+=2;
                //System.out.print("\n");
            }
            System.out.println();
        }
    }
}