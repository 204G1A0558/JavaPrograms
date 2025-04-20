import java.util.Scanner;

public class Prac_3 {
//    public static int fact(int n){
//        if(n==0||n==1){
//            return 1;
//        }
//        else{
//            return n*fact(n-1);
//        }
//    }

    //using while loop
//    public static int fact(int n){
//        if(n==0||n==1){
//            return 1;
//        }
//        int res=1;
//        int i=1;
//        while(i<=n){
//            res*=i;
//            i++;
//        }
//        return res;
//    }
    public static void main(String[] args) {
        //even number using while loop
        int i=1;
        int n=80;
        while(i<=n){
            if(i%2!=0)
            //if(i%2==0){
            {
                System.out.print(i+" ");
            }
            i++;
            }
        }

//        //factoial
//        int n1=5;
//        if(n1<0){
//            System.out.println("not possible");
//        }
//        else {
//            int res=fact(n1);
//            System.out.print(res);
//        }
//
//
//        int n=1;
//        for(int i=50;i>=n;i--){
//            if(i%2==0&&i%3==0){
//                System.out.print(i+" ");
//            }
//        }
        // using while loop
//        int n=50;
//        int i=n;
//        while(i>=1){
//            if(i%2==0&&i%3==0){
//                System.out.print(i+" ");
//            }
//            i--;
//        }
        //FIBANOCCI
//        int n=8;
//        System.out.println("the fibanocci series:");
//        int first=0;
//        int secoond=1;
//        for(int i=1;i<=n;i++){
//            System.out.print(first+" ");
//            int next=first+secoond;
//            first=secoond;
//            secoond=next;
//        }

        //factorial using for loop


    }

