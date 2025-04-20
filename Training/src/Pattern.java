public class Pattern {
    public static void main(String[] args) {
        // int n=7;
        int n = 7, k = 0;
        n |= 1;
        int num = 'A';
        for (int i = 0; i < n; i++) {
            k = n / 2;
            for (int j = 0; j < n; j++) {
                //if (i == j)
                    if(j==0||(i+j==n-1&&i>=n/2)||(i==j&&i>=n/2)||j==n-1){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                    // if(!(i-j>=0))
                    //if(!(i-j>0))
                    //if(!(i+j<n-1))
                    //if(!(i+j>n-1))
                    //if(i==0||i==n||j==0||j==n)
                    //if(i==0||j==0||(i==n/2&&j<=n/2))//code for alphabet "F"
                    //if((i*j==0)||j==n-1||i==n/2)//to print A
                    //if(i*j==0||i==n/2||j==n-1||i==n-1)//logic for B
                    //if(i*j==0||i==n-1)//logic for c
                    //if(i*j==0||i==n-1||j==n-1)//logic for D
                    //if(i*j==0||i==n-1||i==n/2)//logic\\ E
                    //if(i*j==0||i==n-1||(j==n-1&&i>=n/2)||(i==n/2&&j>=n/2))//logic for G
                    //if(j==0||j==n-1||i==n/2)//code for H
                    //if(i==0||i==n-1||j==n/2)//logic for I
                    //if(i==0||j==n/2||(i==n-1&&j<=n/2))//logic for J
                    //if(j==0||(i-j==n/2||i+j==n/2))//logic for k
                    //if(j==0||i==n-1)//logic for L
                    // if(j==0||i-j==0||j==n-1)//logic for N
                    //if(i*j==0||j==n-1||i==n-1)//logic for O
                    //if(i*j==0||(j==n-1&&i<=n/2)||i==n/2&&j<=n)//logic for P
                    //if((i*j==0||(j==n-1&&i<=n/2)||i==n/2&&j<=n)||i-j==2)
                    //if(i==0||i==n/2||i==n-1||(j==n-1&&i>=n/2)||(j==0&&i<=n/2))//logic for S
                    //if((j==0&&i<=n/2)||i==0&&j<=(n-1)||(j==n-1)||(i==n/2&&j<=n-1))//logic for q
                    //if(i==0||j==n/2)//logic for T
                    //if(j==0||i==n-1||j==n-1)//logic for U
                    //if(j==0||(i==j&&i<=n/2)||(i+j==n-1)&&i<=n/2||(j==n-1))//logic for M
                    //if((i==j&&i<=n/2)||(i+j==n-1)&&i<=n/2)//logic for V
                    //if(j==0||(i+j==n-1&&i>=n/2)||(i==j&&i>=n/2)||j==n-1)//logic for W
                    //if(i==j||i+j==n-1)//logic for X
                    //if(((i==j&&i<=n/2)||(i+j==n-1)&&i<=n/2)||j==2&&i>=n/2)//logic for Y
                    // if(i==0||((i+j==n-1)||i==n-1))//logic for Z
                    // if(j==n/2||(i+j==n/2&&i<=n/2)||i==n-1)// logis to print 1
                    //if(i==0||(j==n-1&&i<=n/2)||(i==n/2)||(j==0&&i>=n/2)||(i==n-1))//logic for 2
                    //if(i==0||i==n-1||i==n/2)//logic for 3
                    //if((j==0&&i<=n/2)||(i==n/2)||j==n-1)//logic for 4
                    //if((j==0||i==n-1)||(j==n-1&&i>=n/2)||i==n/2)//logic for 6
                    //if(i==0||i+j==n-1)//logic for 7
                    // if(i==0||i==n-1||j==0||j==n-1||i==n/2)//logic for 8
                    // if(i==0||j==n-1||(j==0&&i<=n/2)||i==n/2)//logic for 9
//                    if(i-j>=0&&i+j<=n-1)
//                        System.out.print("*");
//                    else System.out.print(" ");//logic 1

                    //if(i-j>=0&&i+j<=n-1)//logic 2
                    //if(i-j>=0&&i+j<=n-1)//logic 3
                    //System.out.print((char) (65 + n / 2 - j));
                    //if(i+j>=n-1&&i-j<=0)
                    //System.out.print(j-n/2+" ");//logic for 5
                    //System.out.print((char)(65+j-n/2)+" ");//logic for 6
/*     logic 7          if((i<=j&&j>=n-i-1))
//                    System.out.print(" "+k--);
//                else System.out.print("  ");

 */
                /*logic 8
                if((i<=j&&j>=n-i-1))
                    System.out.print(" "+(j-n/2));
                else System.out.print(" ");
                */
                /*logic 9
                if((i<=j&&j>=n-i-1))
                    System.out.print(" "+(char)(num+j-n/2));
                else System.out.print(" ");
                */
                 /*logic 10
                if((i<=j&&j>=n-i-1))
                    System.out.print(" "+(char)(num+k--));
                else System.out.print(" ");
                */
                }
                System.out.print("\n");
            }
        }
    }
