package JavaPrac;

public class staticvar {
    //static  int num;
//    public static void main(String[] args) {
//        System.out.println(staticvar.num);//here it print "0" because in java all global variables are given some default values
//    }
    int x;
    staticvar(){
        System.out.println(this);
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        new staticvar();
        new staticvar();
    }
}
// NON STATIC MEMBER-> THERE ARE 4 TYPES : ANY FUNCTINALITY THAT IS SPECIFIC TO A OBJECT OF A CLASS


