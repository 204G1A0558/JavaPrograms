import java.util.Scanner;

//public class Prac_set_Aloha {
    //public static void main(String[] args) {
        /*
        System.out.println("print numbers from 1 to 100");
        for(int i=2;i<=100;i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    private static boolean isPrime(int num){
        if(num<=0){
            return false;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return  false;
            }
        }
        return true;
        */

    //PALINDROME: sequesnce that reads the same backwrds as forwards
    //eg: madam

       /* String input="faraf";
        if(isPalindrome(input)){
            System.out.println(" it is a plaindrome");
        }else{
            System.out.println("ids not a palindrome");
        }
    }
    private static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

        */

    //FACTOR OF NUMBER
        /*

        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("factors of "+number+"are:");
        for(int i=1;i<=number;i++){
            if(number % i==0){
                System.out.print(i+" ");
            }
        }
        sc.close();

         */

    // PRINTING THE TABLE OF ANY  NUMBER
/*
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d=%d\n",num,i,num*i);
        }
    }

    */
    //POLYMORPHISIM:  poly morphism means Many forms, this is a concept which
    // wecan perform a singlr task in many forms ,where single entity behaves
    // in different cases.



/*class Animal {
        void sound() {
            System.out.println("animal sound");
        }
    }

    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("dog barks");

        }
    }

    class cat extends Animal {
        void sound() {
            System.out.println("cat meows");
        }
    }
public class Prac_set_Aloha {

    public static void main(String[] args) {
       Animal al =new Dog();
       Animal al2=new cat();
       al.sound();
       al2.sound();
    }
    }

 */
//OVER LOADING, overrriding are two fundamental coepts of oops,and these are used to impeove the reusability
//and implementation when we required
//Overloading : It is define as multiole methods with same name and different parameters and diff data types
//types of argumnt passsd during metid cal ,it is compile time.

//overriding:it define as method when a subclass provide  implemention of method which is already in superclass
//it is to create the polymorphic  behaviour of hiearchy(same name ,return type,parmeter)
//runtime(dynamic polymorphism)

//ex:
//class Prac_set_Aloha{
//    public int add(int a,int b){
//        return a+b;
//    }
//    public double add(int a,int b,int c){
//        return a+b+c;
//    }
//
//    public static void main(String[] args) {
//        Prac_set_Aloha pp= new Prac_set_Aloha();
//        pp.add(22,22);
//        pp.add(1232,1233,445444);
//    }
//}

//overriding:
//class Animal {
//    void makesound() {
//        System.out.println("animal make sound");
//    }
//}
//    class dog extends Animal{
//        void makesound(){
//            System.out.println("dob bark");
//        }
//    }
//    class cat extends Animal{
//    void makesound(){
//        System.out.println("cat mewo");
//    }
//    }
//class Prac_Set_Aloha{
//    public static void main(String[] args) {
//           Animal al= new dog();
//           Animal al2 =new cat();
//           al.makesound();
//           al2.makesound();
//
//
//        }
//    }





