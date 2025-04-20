public class Main
{
    static int n=5;
    static int arr[]=new int[n];
    static int fun(int n){
        if(arr[n-1]!=0)
            return arr[n-1];
        int x=1,k;
        if(n==1 ){

            arr[n-1]=x;
            return arr[n-1];
        }
        for(k=1;k<n;k++)
            x=x+fun(k)*fun(n-k);
        arr[n-1]=x;
        return x;
    }
    /*
    int fun ( int n ) {

   int x = 1, k ;

   if ( n == 1) return x ;

   for( k = 1 ; k < n ; ++ k )

       x = x + fun( k ) * fun( n - k ) ;

   return x ;

}

    */

    public static void main(String[] args) {
        System.out.print(fun(n));

    }
}
