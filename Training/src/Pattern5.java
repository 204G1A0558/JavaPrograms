public class Pattern5 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n;j++)
                //if(i==n-1)
                if(i+j==n-1/2||i-j==-(n/2))
                    System.out.print("*  ");
            System.out.print(" ");
        }
        System.out.println("");
    }
}
