package stringsconcept;

import java.util.Scanner;

public class stringInsert {
    static String insert(String orig,String insertinto,int index) {
        String str = new String();
        for (int i = 0; i < orig.length(); i++) {
            str += orig.charAt(i);
            if (i == index) {
                str += insertinto;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String orig=sc.nextLine();
        String insertinto=sc.nextLine();
        int index=sc.nextInt();
        System.out.println("original string : "+orig);
        System.out.println("string to be insered: "+insertinto);
        System.out.println("index that to be inserted: "+index);
        System.out.println("modified string: "+insert(orig,insertinto,index));
    }
}
