package StringBuffer;
class myString{
    String msg;
    myString(String msg){
        this.msg=msg;
    }
    public String toString()
    {
        return msg;
    }
}

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Hello"+new StringBuilder("java se 7"));
        System.out.println("Hello"+new myString("java se 7"));

      //StringBuffer sb = new StringBuffer(1000);
      StringBuilder sb = new StringBuilder();
        sb.append("faraz").append(2).reverse().insert(1,22).delete(1,3);
        //sb.delete(0,sb.length());
      sb.reverse();
       // sb.setLength(10);
        //sb.ensureCapacity(1000);
        System.out.println(sb);

//        sb.append("abc");
//        sb.trimToSize();
//        System.out.println(sb.capacity());

      //sb.delete(1,5);
//      sb.insert(2,'z');
//        sb.deleteCharAt(2);
    // System.out.println(sb);
//       sb.append(" pi value");
//        sb.append(3.14);
//        sb.append("is exactli");
//        sb.append(true);
//        System.out.println(sb);
//        sb.setCharAt(1,'o');
//        System.out.println(sb);
    }
}
