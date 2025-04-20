package Day1;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int size=sc.nextInt();
            for(int j=0;j<size;j++)
            {
                for(int k=0;k<size;k++)
                {
                    System.out.print(i*j+1);
                }
                System.out.println();
            }

        }
    }
}
