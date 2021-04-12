package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.Datas;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ExercicioData {

    public static void main (String [] args) throws ParseException {

        SimpleDateFormat dataMaio2010 = new SimpleDateFormat("dd, MMM, yyyy", new Locale("pt"));
        Date dataMaio = dataMaio2010.parse("15, Mai, 2010");
        var dataMay = dataMaio.getTime();
        Date convertDateMaio = new Date(dataMay);
        System.out.println(convertDateMaio + "\n*************************");

        SimpleDateFormat dataNascimento = new SimpleDateFormat("dd, MMM, yyyy", new Locale("pt"));
        Date data = dataNascimento.parse("15, Jan, 1997");
        var dataNasc = data.getTime();
        Date convertDateNasc = new Date(dataNasc);
        System.out.println(convertDateNasc + "\n*************************");

        boolean anterior = convertDateNasc.before(convertDateMaio);
        boolean depois = convertDateNasc.after(convertDateMaio);

        System.out.println("Nascimento anterior a Maio 2010 : " + anterior + "\n*************************");
        System.out.println("Nascimento depois de Maio 2010 : " + depois + "\n*************************");

        int comparaCaso1 = convertDateNasc.compareTo(convertDateMaio); // passado -> futuro
        int comparaCaso2 = convertDateMaio.compareTo(convertDateNasc); // futuro -> passado

        System.out.println("Comparação 1 Nascimento antes de Maio 2010 : " + comparaCaso1 + "\n*************************");
        System.out.println("Comparação 2 Maio 2010 depois de Nascimento: " + comparaCaso2 + "\n*************************");

    }
}
