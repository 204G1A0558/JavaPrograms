import java.util.Scanner;
public class palindromeCout {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();//madam is a madam
        String arr[]=str.split(" ");//[madam, is, a,madam]
        int count=0;                     //   0      1  2   3
        for(int i=0;i<arr.length;i++){
            int res=func(arr[i]);
            if(res==1){
                count=count+1;
            }
        }
        System.out.println(count);
    }
    static int func(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res=res+s.charAt(i);
        }
        if(res.equals(s)){
            return 1;
        }
     return 0;
    }
}
