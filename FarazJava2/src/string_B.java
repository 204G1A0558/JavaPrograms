public class string_B {
    public static void main(String[] args) {
        //sting
        String str= new String("faraz");
        str.concat("mohammad");
        System.out.println(str);//  o/p:faraz-because as we have func
        // calles concat there the points to noting we hav not assing any
        // varble so itb will tahe str -(faraz) only

        //STRINGBUFFER
        StringBuffer strb= new StringBuffer("faraz");
        strb.append("mohmmad");
        System.out.println(strb);


        //"==" this operator always means for reference comparison
        //it return true if and only in both reference points to same obj
        //object las equals method meant for refference/aress comparission =>excatly equals
        // to the "==" operator->refference comparriosion
        //string clas equals ment for content comparissio
        //stringbuffer equals is not overriden
        //

    }
}
