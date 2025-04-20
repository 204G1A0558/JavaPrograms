package JavaPrac;

public class WrapperClass {
    public static void main(String[] args) {
        int a=100;
        Integer b=Integer.valueOf(a);//PRIMITIVE TO OBJEC
        int y=b.intValue();//OBJECT TO PRIMITVE
//        System.out.println(((Object) b).getClass().getSimpleName());
//        System.out.println(b+" "+y);
//        System.out.println(((Object) y).getClass().getSimpleName());
        //STRING TO PRIMITVE
        byte x=100;
        String str=Byte.toString(x);
        byte b1= Byte.parseByte(str);
        System.out.println(str);
        System.out.println(((Object)str).getClass().getSimpleName());
        System.out.println(b1);

        //OBJECT TO A STRING AND SRING TO OBJ
        //OBJ T STRING
        long f=1000;
        Long z=Long.valueOf(f);
        String s=z.toString();
        System.out.println(s);
        System.out.println(((Object)s).getClass().getSimpleName());
        //STRING TO OBJECT
        long m=Long.valueOf(s);
        System.out.println(m);
        System.out.println(((Object)m).getClass().getSimpleName());

    }
}
