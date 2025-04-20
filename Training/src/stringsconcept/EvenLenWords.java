package stringsconcept;

import java.util.Scanner;

public class EvenLenWords {
    public static void printword(String s){
        for(String word:s.split(" "))
            if(word.length()%2==0)
                System.out.println(word);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        printword(str);

    }
}
