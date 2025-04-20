import java.util.Arrays;

public class Multi_dim_array {
    public static void main(String[] args) {
         /*decribing the flats and rooms in the complex
        int[][] flats = new int[2][3];
        flats[0][0] = 100;
        flats[0][1] = 102;
        flats[0][2] = 104;
        flats[1][0] = 107;
        flats[1][1] = 200;
        flats[1][2] = 202;
        for(int i=0;i<flats.length;i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        */




        /* practise on arrays
        DECLRAING THE FLOAT AND ADDING THEM
        float[]marks={23.3f,25.4f,27.3f,33.3f,43.34f,63.3f};
        float sum=0;
        for(float ele:marks){
            sum+=ele;
        }
        System.out.println(sum);
*/

        /* CHECK WEATHER THE ELMENT IN AN ARRAY
        int []arr={123,32,42,54,5634,525};
        int num=43;
        boolean IsInArray=false;
        for(int ele:arr){
            if(num==ele){
                IsInArray=true;
                break;
            }
        }
        if(IsInArray){
            System.out.println("prseet");
        }else{
            System.out.println("not prsent");
        }

         */
        /* to print avg marks of stu in physics
        int[]pMraks={23,43,54,54,34,43,45,60};
        int sum=0;
        for(int ele:pMraks){
            sum+=ele;

        }
        System.out.println(sum/pMraks.length);

         */


        /*2d matrix of 2x3 adding of the two matrices
        int mat1[][]={{2,2,3},
                       {2,4,3}};
        int mat2[][]={{1,2,3},
                       {8,0,3}};
        int res[][]={{0,0,0},
                     {0,0,0}};

        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.format("i=%d,j=%d\n",i,j);
                res[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.print(res[i][j]+" ");
                res[i][j]=mat1[i][j]+mat2[i][j];
            }
            System.out.print("\n");
        }

        //System.out.println("");


         */

        /*reverse array
        int arr[]={7,5,4,5,4,6,5};
        int l=arr.length;
        int n=Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<n;i++){
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int ele:arr){
        System.out.print(ele+"\t");
        }
        */
        //MAX AND MIN ELE OF AN ARRAY
        int arr[]={73,55,4243,5,3434,63243,5424};
        /*int max=0;
        for(int ele:arr){
            if(ele>max){
                max=ele;
            }
            //System.out.println(max);
        }
        System.out.println(max);

         */
        //MIN
        /*int min=7667;
        for(int ele:arr){
            if((ele<min)){
                min=ele;
            }
        }
        System.out.println(min);
       // System.out.println(Arrays.stream(arr).min());//gives the min value from the array
*/
        //check weather ghe array is sorted or not
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("array is sorted");
        }else {
            System.out.println("not sorted array");
        }
    }

}
