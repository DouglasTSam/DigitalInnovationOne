package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava2.Strings;

public class StringsFormat {
    public static void main (String [] args) {
        var name = "Douglas";
        var lastName = "Samuel";
        final var fullName = name + " " + lastName;

        System.out.println(name);
        System.out.println("Client name = " + name);
        System.out.println("Client Full Name = " + fullName);

        final var message = String.format("Customer %s has the surname %s." , name, lastName);
        System.out.println(message);

        System.out.println(String.format("Number %.2f" , 1.2375d));
    }

}
