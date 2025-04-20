public class Break_Continue {
    public static void main(String[] args) {
        int i=0;
//        for(i=0;i<5;i++){
//            if(i==3){
//                //System.out.println("ends");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("i am here");
//        }

        for(;i<5;i++){
            System.out.println(i);
            if(i==2){
                System.out.println("i am here");
                break;
            }
        }
    }
}
