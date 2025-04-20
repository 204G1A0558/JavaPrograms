public class Practise_set {
    /*printing of mul table
    static void mul(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d x %d = %d",n,i,n*i);
            System.out.println("");
        }

    }

     */
    /*
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    */
    /*SUM OF N NATUTAL NUMBERS IUSING RECURSION
    //sum (n)=1+2+....+n-1+n
    //sum(n)=sum(n-1)+n
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n+sumRec(n-1);
    }

     */
//    static void pattern(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
    /*

     */
    /*
    static int fibo(int n){
        for(int i=0;i<n;i++){
            if(n==1){
                return 0;
            }
            else if(n==2){
                return 1;
            }}
        return fibo(n-1)+fibo(n-2);
    }

     */
    /*
    static int sum(int ...arr){
        int res = 0;
        for(int ele:arr){
            res+=ele;
        }
        return res;
    }
     */
    /*pattern using recursion
    static void pattern_rec(int n){
        if(n>0){
            pattern_rec(n-1);
            for (int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

     */
    /*pattern rev using recursion
    static void pattern_rev_rec(int n){
        if( n == 0 )
            System.out.println("");
        for (int i = n; i >0; i--) {
            System.out.print("*");
        }
        System.out.println();
        //printTriangle(n-1);
        pattern_rev_rec(n-1);
    }

     */
    //celsius to foregin heat
    static float con_temp(int n){
        if(n==0){
            return 32f;

        }else return n*9/5+32f;
    }

        // Driver code
    public static void main(String[] args) {


        //System.out.println("");
       // mul(18);
      //  pattern(5);
//        int a= sumRec(6);
//        System.out.println(a);
       // pattern(5);
//        int count=10;
//        System.out.print(n1+" "+n2);
//        printFibonacci(count-2);

//        int res=fibo(5);
//        System.out.println(res
//        int avg=sum(1,2,3,4,5,6,7)/2;
//        System.out.println(avg);
        //pattern_rec(5);
        //pattern_rev_rec(5);
        float res=con_temp(32);
        System.out.println(res);
    }
}
