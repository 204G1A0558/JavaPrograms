package JavaPrac;

public class ImplicitCast {
    public static void main(String[] args) {
        //implicit casting from byte to int
        byte b=100;
        int i=b;
        char ch='A';
        int x=ch;
        System.out.println(x);
        System.out.println(i);
        //EXCPLICT TYPE CASTING
        byte c=(byte)i;
        System.out.println(((Object)c).getClass().getSimpleName());
        System.out.println(((Object)ch).getClass().getSimpleName());
        System.out.println(((Object)x).getClass().getSimpleName());
    }
}
