import java.util.Scanner;
import java.util.Scanner;

public class String_count {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the first character: ");
        char char1 = scanner.next().charAt(0);

        System.out.print("Enter the second character: ");
        char char2 = scanner.next().charAt(0);
        scanner.close();

        int countChar1 = 0;
        int countChar2 = 0;

        for (char ch : inputString.toCharArray()) {
            if (ch == char1) {
                countChar1++;
            }
            if (ch == char2) {
                countChar2++;
            }
        }

        System.out.println("Frequency of '" + char1 + "' in the string: " + countChar1);
        System.out.println("Frequency of '" + char2 + "' in the string: " + countChar2);
    }
}

//public class String_count {
//    public static int charCount(String str,char target){
//        int count=0;
//        for(char ch:str.toCharArray()){
//            if(ch==target) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        String str1="mohammad faraz";
//        char traget1='a';
//        int count=charCount(str1,traget1);
//        System.out.println(count);
//    }




