public class Main2 {
        public static void main(String[]args){
        int n=9;
//        for(int i=0;i<n;i++){
//        for(int j=0;j<n;j++)
//        if(i+j==(n-1)/2||i-j==-(n/2))
//        System.out.print((char)(65+i));
//        else
//        System.out.print(" ");
//        System.out.println();

                //int n=9;
                //logic 32
               /* for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++)
                                if(i+j==(n-1)/2||i-j==-(n/2))
                                        System.out.print((char)(65+n/2-i));
                                else
                                        System.out.print(" ");
                        System.out.println();
                }*/
                //logic 33
                //ntn=9;
                /*for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++)
                                if(i+j==3*(n-1)/2||i-j==(n/2))
                                        System.out.print("*");
                                else
                                        System.out.print(" ");
                        System.out.println();
                }*/
                //logic 34
                /*for(int i=0;i<n;i++) {
                        for (int j = 0; j < n; j++)
                                if (i + j == 3 * (n - 1) / 2 || i - j == (n / 2))
                                        System.out.print(i - n / 2 + 1);
                                else
                                        System.out.print(" ");
                        System.out.println();
                }*/
                //logic 35
                /*for(int i=0;i<n;i++) {
                        for (int j = 0; j < n; j++)
                                if (i + j == 3 * (n - 1) / 2 || i - j == (n / 2))
                                        System.out.print(n - i);
                                else
                                        System.out.print(" ");
                        System.out.println();
                }
                */
                 //logic 36
                /*for(int i=0;i<n;i++) {
                        for (int j = 0; j < n; j++)
                                if (i + j == 3 * (n - 1) / 2 || i - j == (n / 2))
                                        System.out.print((char)(61+i));
                                else
                                        System.out.print(" ");
                        System.out.println();
                }
                */

                //logic 37
                /*for(int i=0;i<n;i++) {
                        for (int j = 0; j < n; j++)
                                if (i + j == 3 * (n - 1) / 2 || i - j == (n / 2))
                                        System.out.print((char)(64+n-i));
                                else
                                        System.out.print(" ");
                        System.out.println();
                }
                */
                 //logic 38
                /*int c=1,a=n-1;
                for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++)
                                if(i+j==3*(n-1)/2||i-j==(n/2)||i+j==(n-1)/2||i-j==-(n/2))
                                        System.out.print();
                                else
                                        System.out.print(" ");
                        System.out.println();

                }*/
                //logic 39
                /*int c=1,a=n/2+1;
                for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++)
                                if(i+j==3*(n-1)/2||i-j==(n/2)||i+j==(n-1)/2||i-j==-(n/2))
                                        System.out.print((c!=0)?c:a);
                                else
                                        System.out.print(" ");
                        System.out.println();
                        if(c==n/2+1)
                                c=0;
                        if(c!=0)
                                c++;
                        else a--;

                }*/
                //logic 40
               /* char z=64;
                int c=1,a=n/2+1;
                for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++)
                                if(i+j==3*(n-1)/2||i-j==(n/2)||i+j==(n-1)/2||i-j==-(n/2))
                                        System.out.print((c!=0)?(char)(z+c):(char)(z+a));
                                else
                                        System.out.print(" ");
                        System.out.println();
                        if(c==n/2+1)
                                c=0;
                        if(c!=0)
                                c++;
                        else a--;

                }*/
                //logic 41
                char z=64;
                int c=n/2+1,a=1;
                for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++)
                                if(i+j==3*(n-1)/2||i-j==(n/2)||i+j==(n-1)/2||i-j==-(n/2))
                                        System.out.print((c!=29)?(char)(z+c):(char)(z+a));
                                else
                                        System.out.print(" ");
                        System.out.println();
                        if(c==1)
                                c=29;
                        if(c!=29)
                                c--;
                        else a++;

                }

        }
        }



