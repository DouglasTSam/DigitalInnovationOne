package digital.innovation.one.utils;

import digital.innovation.one.utils.internal.DivHelper;
import digital.innovation.one.utils.internal.MultHelper;
import digital.innovation.one.utils.internal.SomaHelper;
import digital.innovation.one.utils.internal.SubHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MultHelper multHelper;
    private SomaHelper somaHelper;
    private SubHelper subHelper;

    public Calculadora (){
        divHelper = new DivHelper();
        multHelper = new MultHelper();
        somaHelper = new SomaHelper();
        subHelper = new SubHelper();
    }

    public int divisao (int a, int b){
        return divHelper.executar(a,b);
    }

    public int multiplicacao (int a, int b){
        return multHelper.executar(a,b);
    }

    public int soma (int a, int b){
        return somaHelper.executar(a,b);
    }

    public int subtracao (int a, int b){
        return subHelper.executar(a,b);
    }
}
