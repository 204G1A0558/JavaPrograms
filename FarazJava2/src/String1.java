import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.concurrent.LinkedBlockingDeque;

public class String1 {
    public static void main(String[] args) {

        /* string is a class in java it is not any priitive daata type


         */
//        String s = new String("faraz    ");
//        String s1=new String("Mohammad Faraz");
//        System.out.println(s1.replace(" ","_"));
//        System.out.println(s);
        String S2="Dear <|name|>,Thnaks A lot";
        S2=S2.replace("<|name|>","faraz");
        System.out.println(S2);
        String s4= "i am mohammad   faraz  of  cse  ";
        System.out.println(s4.indexOf("  "));
        System.out.println(s4.indexOf("   "));
        //int a=9;float n=55.3f;
        //System.out.printf("the value of a is %d and n is %f",a,n);
        //-----------------STRING METH0DS----------------------------------------------//
//        System.out.println(s.length());//GIVES THE LENGHT OF STRING
//        System.out.println(s.toLowerCase());//PRINT IN LOWER CASE
//        System.out.println(s.toUpperCase());// PRINT IN UPPER CASE
//        System.out.println(s.trim());//REMOVE THE UNWANTED SPACES
//        System.out.println(s.getBytes());//RETURN THE STRING IN BYE FORMAT
//        System.out.println(s.getBytes());//SAME AS ABOVE BUT SLIGHTLY DIFFREENTIATIVE PROPERRTY
//        System.out.println(s.charAt(2));//RETURN THE POSITION 2 OF STRING
//        System.out.println(s.indexOf('z'));//RETURN THE INDEX VALUE OF PARTICULAR CHARCTER
//        System.out.println(s.indexOf('z',2));//return the specified index of charchter by chcking the from index value given if it is not valid as compre to char then it return -1
//        System.out.println(s.replace('z','S'));//IT WILL REPLACE THE CHAR SPECIFIED
//        System.out.println(s.lastIndexOf('r','4'));//gives the index value ofspecified char
//        System.out.println(s.substring(0,2));//return the char in string from 0 and 2  but not 2 indexd char
//        System.out.println(s.chars());
//        System.out.println(s.codePointAt(1));//gives the value of char in unicode format a-97 ASCII value
//        System.out.println(s.codePoints());//binary format
//        System.out.println(s.compareTo(s1));//compae between to strings
//        System.out.println(s1.compareTo(s));//
//        System.out.println(s.compareToIgnoreCase(s1));// it will ingnore cases and if lowwe it retun 0 it upper rturn 1
//        System.out.println(s.concat(s1));//concatination of two strings
//        System.out.println(s.contains(s1));
//        System.out.println(s.contentEquals(s1));
//        System.out.println(s.hashCode());
//        System.out.println(s.split(s));
//        System.out.println(s.lines());
//        System.out.println(s.indent(2));//give spaces indendation
//        System.out.println(s.strip());//remove the white spaces
    }
}
