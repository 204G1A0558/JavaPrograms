import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxRepeate {
    static void repetedString(String s){
        HashMap<String,Integer> map=new HashMap<>();
        String words[]=s.split(" ");
        for(int i=0;i< words.length;i++){
            String s1=words[i];
            if(map.containsKey(s1)){
                int j= map.get(s1);
                map.put(s1,j+1);
            }
            else{
                map.put(s1,1);
            }
        }
        int max=0;
        Map.Entry m2=null;
        for(Map.Entry m1:map.entrySet()){
            int n=(int)m1.getValue();
            if(n>max){
                max=n;
                m2=m1;
            }
        }
        System.out.println(m2.getKey()+ "words repeated are "+m2.getValue()+" times");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
    }
}
