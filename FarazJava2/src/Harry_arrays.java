public class Harry_arrays {
    public static void main(String[] args) {
        //declaration of array
        //int []a;
        //declare+memory allocation
        int []a1=new int[9];
        //decalration +initilization
        //int []a2={10,90,9,8};
        //memory allocation
        //a= new int [5];
        //strore the datta of 5 students in an array
        a1[0]=2;
        a1[1]=11;
        a1[2]=99;
        a1[3]=98;
        a1[4]=12;
        a1[5]=100;
        for(int i=0;i<a1.length;i++) {
            System.out.print(a1[i]+"\t");
        }
        // reversre of array
        System.out.println("\n");
        for(int i=a1.length-1;i>0;i--){
            System.out.print(a1[i]+"\t");
        }
        //printing the array using for each loop
        System.out.println("\n");
        for(int marks:a1){
            System.out.print(marks+"\t");
        }
    }
}
