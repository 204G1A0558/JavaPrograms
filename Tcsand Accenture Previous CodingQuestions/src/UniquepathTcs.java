import java.util.Scanner;

public class UniquepathTcs {
    static int f(int i,int j,int dp[][]){
        if (i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;

        if(dp[i][j] !=-1) return dp[i][j];
        int up=f(i-1,j,dp);
        int left=f(i,j-1,dp);
        dp[i][j]=up+left;
        return dp[i][j];
    }
    static int uniquepath(int m,int n){
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return f(m-1,n-1,dp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the grid
        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();

        // Call the uniquepath method
        int result = uniquepath(m, n);

        // Display the result
        System.out.println("The number of unique paths from top-left to bottom-right is: " + result);
    }
 }
