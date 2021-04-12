package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava2.Strings;

import java.util.Arrays;

public class Strings {
    public static void main (String [] args){
        var name = "Douglas";
        var lastName = "Samuel";
        final var fullName = name +" "+ lastName;

        System.out.println(name);
        System.out.println("Customer name = " + name);
        System.out.println("Customer Full Name = " + fullName);
        var string = new String(" My String ");

       /* System.out.println("Char in position : " + string.charAt(5));
        System.out.println("Amount : " + string.length());
        System.out.println("Whithout trim : [" + string + "]");
        System.out.println("Whit trim : [" + string.trim() + "]");
        System.out.println("Lower Case : [" + string.toLowerCase() + "]");
        System.out.println("Uper Case : [" + string.toUpperCase() + "]");
        System.out.println("Contains 'M'? :  " + string.contains("M"));
        System.out.println("Contains 'X'? :  " + string.contains("X"));
        System.out.println("Replace : " + string.replace("y","e"));
        System.out.println("Equals? : " + string.equals(" My String "));
        System.out.println("EqualsIgnoreCase? : " + string.equalsIgnoreCase(" mY sTriNG "));
        System.out.println("Substring(1,6) : " + string.substring(4,10));*/
        System.out.println("A B C D E F G".toCharArray());
        System.out.println(Arrays.toString("Aula de Java".split(" ")));
        System.out.println("Aula".concat(" de Java"));
        System.out.println("123  a4da qw".replaceAll("[0-9]","#"));

    }
}
