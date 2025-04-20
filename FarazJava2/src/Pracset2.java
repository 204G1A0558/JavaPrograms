import java.util.Scanner;

//import java.util.Scanner;
//class Animal{
//    void move(){
//        System.out.println("animal is moving");
//    }
//}
//class Dog extends Animal{
//    void move(){
//        System.out.println("dog is moving");
//    }
//}
//class cat extends Animal{
//    void move(){
//        System.out.println("cat is moving");
//    }
//}

//Printing the sum of n natural numbers
public class Pracset2 {

    public static boolean isPrime(int n){
        if(n==0){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

//
//    //factorial
//
//    public static int fact(int n){
//        if(n==0||n==1){
//            return 1;
//
//        }return n*fact(n-1);
//    }

//    //Factorial
//    public static int Factorial(int n){
//        if(n==0||n==1){
//            return 1;
//        }
//        else {
//            return n*Factoral(n-1);
//        }
//    }




//    public static int sumOf(int n){
//        int sum=0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        return sum;
//    }


//    //sum of n natiral number
//    public static int Sumof(int n)
//    {    int sum=0;
//    for(int i=0;i<=n;i++){
//        sum+=i;
//    }
//    return sum;
//    }
    public static void main(String[] args) {
        //prime numbers from 1 to 100
//        System.out.println("prime numbers from 1 to 100")
//        for (int i = 2; i <= 100; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }

        //sum of n natural numbers
//         Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        sc.close();
//        int res=Sumof(n);
//        System.out.println(res);
//    }
//    public static boolean isPrime(int n){
//        if(n<=0){
//            return false;
//        }
//        for(int i=2;i<Math.sqrt(n);i++){
//            if(n%i==0){
//                return false;
//            }
//
//        }
//        return true;
//    }


//
//        //even and odd numbers
//      Scanner sc = new Scanner(System.in);
//        System.out.println("enter number");
//        int start=sc.nextInt();
//        System.out.println("enter the end number");
//        int end=sc.nextInt();
//        sc.close();
       //System.out.println("even number between\t" +start+ "\tand\t" +end+ "\tare:");
//        for(int i=start;i<=end;i++){
//            if(i%2==0){
//                System.out.print(i+" ");
//            }
//        }
//        System.out.println("");
//        System.out.println("odd numbers between\t" +start+ "\tand\t" +end+ "\tare:");
//        for(int i=start;i<=end;i++){
//            if(i%2!=0){
//                System.out.print(i+" ");
//            }
//        }



        //even or odd using while loop
//        int i=start;
//        System.out.println("even number between\t" +start+ "\tand\t" +end+ "\tare:");
//        while(i<=end){
//            if(i%2==0){
//                System.out.print(i+" ");
//            }
//            i++;
//        }
//        System.out.println("");
//        i=start;
//        System.out.println("odd number between\t" +start+ "\tand\t" +end+ "\tare:");
//        while(i<=end){
//            if(i%2!=0){
//                System.out.print(i+" ");
//            }
//            i++;
//        }
        //factorial
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter a number");
//        int n1=sc.nextInt();
//        if(n1<0){
//            System.out.println("it is not possible");
//        }
//        else {
//            int s=Factorial(n1);
//            System.out.println(s);
//        }
//        Scanner sc= new Scanner(System.in);
//        int n1=sc.nextInt();
//        if(n1<0){
//            System.out.println("not possible to find fact");
//        }
//        else {
//            int res = fact(n1);
//            System.out.println(res);
//        }




        // using methods
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number");
//        int n= sc.nextInt();
//        sc.close();
//        int res=sumOf(n);
//        System.out.println(res);


//        System.out.println("priem numbers are:");
//        for(int i=2;i<=100;i++){
//            if(isPrime(i)){
//                System.out.print(i+" ");
//            }
//        }
//    }
//    public static boolean isPrime(int num){
//        if(num<=1){
//            return false;
//        }
//        for(int i=2;i<Math.sqrt(num);i++){
//            if(num%i==0){
//                return false;
//            }
//        }
//        return true;

        //palindrome

//        String input="faraz";
//        if(isPalindrome(input)){
//            System.out.println("it is a palindrome");
//        }
//        System.out.println("not a plaindrome");
//    }
//    public static boolean isPalindrome(String str){
//        int left=0;
//        int right=str.length()-1;
//        if(left<right){
//            if(str.charAt(left)!=str.charAt(right)){
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;

//        //finding the factors of number
//        int n=9;
//        System.out.printf("factors of %d are: ",n);
//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                System.out.print(i+" ");
//            }
//        }

        //Table
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number:");
//        int n= sc.nextInt();
//        for(int i=1;i<=10;i++){
//            System.out.printf("%d x %d =%d\n",n,i,n*i);
//
//        }
//    }

        //polymorphism:it is defined as many forms
//        Animal al=new Dog();
//        Animal al2=new cat();
//        al.move();
//        al2.move();

        //over loading: it is define as multiple methods with same
        // merthod diffret parameters it is mainly use to reusability and imoenetatoion easy
        //overriding: it is define as the method which has same name and same oarameters and its mainly saya thtusing of the method
        // whih= is alrady n the superclass ,it is runtime (dynamicaly polymorphism)


        //Numbers  print reverse  order which are   not divisible by 2& 3
//        for(int i=50;i>=1;i--){
//            if(i%2==0&&i%3==0){
//                System.out.print(i+" ");
//            }
//        }

        //ascending order of printing

//        for(int i=1;i<50;i++){
//            if(i%2==0&&i%3==0){
//                System.out.print(i+"  ");
//            }
//        }

        //sum of first n natutal numbers
       //Scanner sc= new Scanner(System.in);
        //int n=sc.nextInt();
//        int sum=0;
//        for(int i=0;i<n;i++){
//            sum+=i;
//        }
//        System.out.println(sum);
//
//        int sum=0;
//        int i=1;
//        while(i<=n){
//            sum+=i;
//            i++;
//        }
//        System.out.println(sum);

        //sum of n natural numbers using methids


        //return sum;

        //FACTORILA: it is ma mathematical proces where the product of all +ve integer are caluclated



}
}


