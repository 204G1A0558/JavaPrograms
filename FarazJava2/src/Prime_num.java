import java.util.Scanner;

public class Prime_num {
//    public static boolean isPrime(int n){
//        if(n<=0){
//            return false;
//        }
//        for(int i=2;i<Math.sqrt(n);i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }


    //check wether given number is prome or nit
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        if(n==2){
            return false;

        }
        if(n%2==0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        //Scanner sc= new Scanner(System.in);
//        System.out.println("print prime number from 1 to 100:");
//        for(int i=2;i<=100;i++){
//            if(isPrime(i)){
//                System.out.print(i+" ");
//            }
//        }
        int num=23;
        for(int i=3;i<Math.sqrt(num);i+=2){
            if(isPrime(i)){
                System.out.println("is a prime");
            }else {
                System.out.println("not prime");
            }
        }

    }
}
