package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava1.classes.usuarios;

public class ProgramSuperUsers {
    public static void main(String[] arg) {
        final var superUser = new SuperUsers (  "Douglas", "senha1234");

        superUser.getLogin();
        System.out.println(superUser.getLogin());
        superUser.getPassword();
        System.out.println(superUser.getPassword());

        String root = superUser.name;
        System.out.println(superUser.getLogin());
    }
}
