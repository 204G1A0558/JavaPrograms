public class pyramid {
    public static void main(String[] args) {
        int n=4;
        int spc=n-1,start=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<spc;j++)
                System.out.print(" ");
            for(int j=0;j<start;j++)
                System.out.print("*");
        spc--;
        start+=2;
        System.out.println();
        //logic 2 without spc.,star increents
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++)
//                System.out.print(" ");
//            for(int j=0;j<2*i+1;j++)
//                System.out.print("*");
//            System.out.println("");
//        }

        //using oinlt 1 loop
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n+i;j++){
//
//                if(j<n-i-1)
//                    System.out.print(" ");
//                else

                    //System.out.print(65+i);
                    //System.out.print(i);//00 111 222
                    //System.out.print((char)(65 + j - (n - i - 1)));// topritn a,b,c
                    //System.out.print("*");
                    //System.out.print(j-(n-i-1));//0,1 print

            }
            System.out.println();
        }
    }

