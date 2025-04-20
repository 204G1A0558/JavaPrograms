public class Recursion {
    static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }static int fact_iterate(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            int product=1;
            for(int i=1;i<=n;i++){
                product*=i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fact_iterate(5));
    }
}
