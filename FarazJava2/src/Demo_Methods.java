public class Demo_Methods {

    static void foo() {
        System.out.println("i am here");
    }

    static void foo(int a) {//parameters
        System.out.println(" i am good rnogh" + a + "times");
    }

    static void change(int a) {
        a = 99;
    }

    static void changeArr(int[] arr) {
        arr[0] = 12;
    }

    /*static int logic(int x,int y){
        int c;
        if(x>y){
            c=x+y;
        }else{
            c=x+y-2;
        }
        return c;
    }
    public static void main(String[] args) {
        //logic(22,33);
        System.out.println(logic(66,22));

     */
    /*change of integer when we cahnge in the main method
    public static void main(String[] args) {
        int marks[]={12,32,43,43,22,32};
        int x=22;
        change(x);
        System.out.println("tge value after change:"+x);
        changeArr(marks);
        System.out.println(marks[0]);



    }

     */
    // method over loading
    public static void main(String[] args) {
        foo();
        foo(22);//arguments
    }
}
