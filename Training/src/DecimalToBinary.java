public class DecimalToBinary {
    public static void main(String[] args) {
        //decimal to binary
//        int n=13,r=0,sum=0,k=1;
//        while(n>0){
//            r=n%2;
//            n=n/2;
//            sum=sum+(r*k);
//            k=k*10;
//        }
//        System.out.println(sum);
//    }

        //binarytoDecimal
        int n=1011,r=0,sum=0,k=1;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+(r*k);
            k=k*2;
        }
        System.out.println(sum);
    }

}
