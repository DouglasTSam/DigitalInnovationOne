package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava1.types.primitives;

public class Primitives {
    public static void main (String [] args){
        byte b; // 8 bits
        byte b1 = 127 ; //max. size
        byte b2 = -128 ; //min. size

        char c; // 16 bits
        char c1 = 'A';
        char c2 = 15; //values unique do not accept "aa"

        short s; // 16 bits
        short s1= 32767; //max. size
        short s2 = -32768 ; // min. size

        int i; // 32 bits
        int i1= 2147483647; //max. size
        int i2= -2147483648; // min. size

        long l; // 64 bits
        long l1 = 9223372036854775807L; //max. size
        long l2 = -9223372036854775808L; // min. size

        float f; // 32 bits //// max.size = 3.402,823,5 E+38.
        float f1 = 65f;
        float f2 = 65.0f;
        float f3 = - 0.07f; // 1.4 E-45

        double d; // 64 bits  //// max.size = 1.797,693,134,862,312,6 E+308
        double d1 = 1025.999;
        double d2 = 12.84332;

        boolean tr = true;
        boolean fls = false;
    }
}
