package Day1;

public class Day1 {
    static int Even=0;
    static int Odd=0;
    public static int length(int val){
        int temp=val;
        int count=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        return count;
    }
    public static int reverse(int val){
        int rev=0;
        int temp = val;
        while(temp>0) {
            //int temp = val;
            rev *= 10;
            rev += temp % 10;
            temp /= 10;
        }
        return rev;
    }
    public static void evenCount(int val){
        int temp=val;
        int even=0,odd=0;
        while(temp>0){
            if((temp%10)%2==0){even++;}
            else{odd++;}temp=temp/10;
            //System.out.println("even="+even+"\todd="+odd);
        }
        System.out.println("even="+even+"\todd="+odd);
    }
public static void EvenAndOdd(int val){
        int temp=val;
        int even=0,odd=0;
        while(temp>0){
            if((temp%10)%2==0)
            {
                even*=10;
                even+=temp%10;

            }
            else {
                odd*=10;
                odd+=temp%10;
            }
            temp/=10;
        }
        Even=reverse(even);
        Odd=reverse(odd);
    System.out.println("even="+Even+"\todd= "+Odd);
    //System.out.println(reverse(even)+""+reverse(odd));


}
public static void EvenOdd(int val){

}
}
