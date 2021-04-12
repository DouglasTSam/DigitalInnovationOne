package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava1.enums;

public class Program {
    public static void main (String [] arg){

        //final TypeVehicle typeVehicle = new TypeVehicle();

        System.out.println(TypeVehicle.TERRESTRIAL);
        System.out.println(TypeVehicle.AQUATIC);
        //System.out.println(TypeVehicle.valueOf("aerial"));
        System.out.println(TypeVehicle.AERIAL);

        for (TypeVehicle type : TypeVehicle.values()){
            System.out.println("Type : "+ type);
        }

        System.out.println("Code of Status CLOSE = "+ Status.CLOSE.getCod());
        System.out.println("Text of Status OPEN = "+ Status.OPEN.getText());

    }
}
