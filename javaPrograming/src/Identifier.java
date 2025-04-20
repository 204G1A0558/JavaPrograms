public class Identifier {
    public static void main(String[] args) {

        int x=10;//is an identifier ->name in a java program is kknown as an identifier (here x is variable name)

        System.out.println(x);
    }
}
/*RULES OF AN IDENTIFIER:
1.Only use the character to define the identifiers
            (a-z)
            (A-Z)
            (0-9)
            underscore(_)
            $(symbol)
==> java identifier are case-sensitive .
==> there is no length limit fo the java identifiers, but it is re-commanded  to use not more than 15(>15)
==>RESERVES WORDS are not used as identifiers ,and the all predefined java class and interface can be used
==>EX:                              ex2:
        class one{                      class two{
        int string=10; //class                     int Runnable=10;//interface
        p.s.v.m(string);                                p.s.v.m(Runnable);
        }}                                          }}
 */


/*DATA TYPE : PRIIMTIVE AND NON PRIMITIVE
PRIMITIVE->NUMERIC , CHAR , BOOLEAN
NUMERIC->INTEGERAL , FLOATING
INTEGERL->BYTE, SHORT,INT,LONG
BYTE->8-bits (+128 to -127)
->most significant bit that ae 0's are +ve and 1's are -ve ,here +ve are directly repersented in memonry but -ve are represent as the 2's compliment.
->BYTE DATA TYPE IS BEST SUITABLE IF WE WANT TO HANDLE THE DATA IN TEMRS OF STREAM EITHER FROM FILE OR NETWORK.



SHORT->2-BYTES(-32768 TO 32767)
MOST REAR;Y USED DTATA TYPE
short is most suitable in if we are using 16 bit processor like 8086 but processoor completely outdated sort will alo outdates.

COMSTANT VALUE ASSINGED TO A VARIABLE CALLED AS LITERAL

 */