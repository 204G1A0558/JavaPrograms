import com.sun.security.jgss.GSSUtil;

public class Newpat {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||(i+j==n-1&&i>=n/2)||(i==j&&i>=n/2)||j==n-1)
                    System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    }
