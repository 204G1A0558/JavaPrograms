import java.util.Scanner;

public class FristWord {
    public static StringBuilder longestCommoNPrefix(String[] str){
        StringBuilder res= new StringBuilder();
        for(int i=0;i<str[0].length();i++){
            for(String s:str)
                if(i==s.length()||s.charAt(i)!=str[0].charAt(i)) break;
            return res.append(str[0].charAt(i));
        }
        return new StringBuilder(res.toString());
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str1[]=new String[3];
        for(int i=0;i<=2;i++){
            str1[i]=sc.nextLine();
        }
        longestCommoNPrefix(str1);
    }
}

