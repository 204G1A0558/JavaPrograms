package Strings;

import java.util.Arrays;

public class prac3 {
    public static void main(String[] args) {
        String s="what is your name";
        char ch[]=s.toCharArray();
        int n= ch.length;
        for(int i=0;i<n/2;i++){
            char temp=' ';
            if(ch[i]==' ')
            temp=ch[i];
            ch[i]=ch[n-1-i];
            ch[n-1-i]=temp;


            }
        System.out.println(Arrays.toString(ch));
    }
}
