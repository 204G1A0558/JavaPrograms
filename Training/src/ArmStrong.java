//import java.util.*;
//import java.util.Scanner;
//public class ArmStrong {
//    static boolean isArmStrong(int n) {
//        int temp, digits = 0, last = 0, sum = 0;
//        temp = n;
//        while (temp > 0) {
//            temp = temp / 10;
//            digits++;
//        }
//        temp = n;
//        while (temp > 0) {
//            last = temp % 10;
//            sum += (Math.pow(last, digits));
//            temp = temp / 10;
//        }
//        if (n == sum)
//            return true;
//        else return false;
//    }
//
//    public static void main(String[] args) {
//        int num;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number:");
//        num = sc.nextInt();
////        if (isArmStrong("armstron")) {
////            else
////            {
////                System.out.println("not armstrong");
////            }
//        }
//
//    }
//}
//
