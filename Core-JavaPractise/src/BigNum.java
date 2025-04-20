import java.util.Arrays;

class Num {
    public static int bigNum(int num) {
        String res="";
        int num2=0;
        if(num>0) {
            char[] arr1 = Integer.toString(num).toCharArray();
            char[] arr2 = Integer.toString(num).toCharArray();
            Arrays.sort(arr2);
            char index = arr2[0];
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == index) arr1[i] = ' ';
            }
            System.out.println(Arrays.toString(arr1));
             res= new String(arr1);
            res = res.replaceAll("\\s", "");
             num2=Integer.parseInt(res);
        }
        else{
            num=-1*num;
            char[] arr1 = Integer.toString(num).toCharArray();
            char[] arr2 = Integer.toString(num).toCharArray();
            Arrays.sort(arr2);
            char index = arr2[arr2.length-1];
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == index) arr1[i] = ' ';
            }
            System.out.println(Arrays.toString(arr1));
            res= new String(arr1);
            res = res.replaceAll("\\s", "");
             num2=-1*Integer.parseInt(res);
        }
        return num2;
    }
}
public class BigNum {
    public static void main(String[] args) {
        System.out.println(Num.bigNum(-2048));
    }
}
