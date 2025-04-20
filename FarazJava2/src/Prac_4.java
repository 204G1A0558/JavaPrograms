//interface A {
//    void methodA();
//}

//interface B {
//    void methodB();
//}
//
//class MyClass implements A, B {
//    public void methodA() {
//        System.out.println("Method A from interface A");
//    }
//
//    public void methodB() {
//        System.out.println("Method B from interface B");
//    }
//}
public class Prac_4 {
    public static boolean isPalindrome(int num) {
    int reversedNum = 0;
    int originalNum = num;

        while (num != 0) {
        int digit = num % 10;
        reversedNum = reversedNum * 10 + digit;
        num /= 10;
    }

        return originalNum == reversedNum;
}
    public static void main(String[] args) {


        for(int i=1;i<=100;i++){
            if(isPalindrome(i)){
                System.out.print(i+" ");
            }
        }
//        String str="faraz";
//        if(isPlaindrome(str)){
//            System.out.println("it is palnderome");
//        }
//        else{
//            System.out.println("not a plaindrome");
//        }
//
//    }
//    public static boolean isPlaindrome(String str2){
//        int left=0;int right=str2.length()-1;
//        if(left<right){
//            if(str2.charAt(left)!=str2.charAt(right)){
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//
//
//        MyClass obj = new MyClass();
//        obj.methodA();
//        obj.methodB();
//    public static boolean iSPrime(int n){
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
//
//    public static void main(String[] args) {
//        for(int i=2;i<100;i++){
//            if(iSPrime(i)){
//                System.out.print(i+" ");
//
//            }
//        }
        //prime or not
//    public static boolean isPrime(int n){
//        if(n<=1){
//            return false;
//        }
//        for(int i=2;i<Math.sqrt(n);i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//       Scanner sc= new Scanner(System.in);
//       int num=sc.nextInt();
//       if(isPrime(num)){
//           System.out.println("it is prime");
//       }
//       else System.out.println("not prime");
//    }
        //non prime numbers from 1 to 20
//    public static boolean isPrime(int n){
//        if(n<=1){
//            return false;
//        }
//        for(int i=2;i<Math.sqrt(n);i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        //int num=120;
//        for(int i=2;i<=120;i++){
//            if(!isPrime(i)){
//                System.out.print(i+" ");
//            }
//        }
//    }


        //MULTIPLE INHERITANCE:
        //it is define as mutiple parent clases for a single subclass
        // printing prime number rom 1 to 100


    }
}




