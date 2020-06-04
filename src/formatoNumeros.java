import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
 
class formatoNumeros {
 
    public static void main(String[] args) {
 
        Locale localeBR = new Locale("pt", "BR");
        Locale localeUS = new Locale("en", "US");
        Locale localeFR = new Locale("fr", "FR");
        Locale localeUK = new Locale("en", "UK");
         
         
 
        double valorReal = 291933.1233;
        float valorPercentual = 0.11f;
        int valorInteiro = 82819912;
 
        NumberFormat inteiro = NumberFormat.getInstance();
        NumberFormat dinheiroReal = NumberFormat.getCurrencyInstance(localeBR);
        NumberFormat dinheiroDolar = NumberFormat.getCurrencyInstance(localeUS);
        NumberFormat dinheiroEuroFranca = NumberFormat.getCurrencyInstance(localeFR);
        NumberFormat dinheiroEuroUK = NumberFormat.getCurrencyInstance(localeUK);
        NumberFormat percentual = NumberFormat.getPercentInstance(localeBR);
        NumberFormat numberFormat = NumberFormat.getNumberInstance(localeBR);
         
        DecimalFormat dinheiroYen = new DecimalFormat("\u00A5###,###.###");
 
        System.out.println("Valor Atual: " + valorReal);
        System.out.println("Valor Formatado em Moeda (Real): " + dinheiroReal.format(valorReal));
        System.out.println("Valor Formatado em Moeda (Dolar): " + dinheiroDolar.format(valorReal));
        System.out.println("Valor Formatado em Moeda (Euro/França): " + dinheiroEuroFranca.format(valorReal));
        System.out.println("Valor Formatado em Moeda (Euro/Reino Unido): " + dinheiroEuroUK.format(valorReal));
        System.out.println("Valor Formatado em Moeda com Decimal Format (Yen/Japão): " + dinheiroYen.format(valorReal));
        System.out.println("----------");
        System.out.println("Valor Atual: " + valorPercentual);
        System.out.println("Valor Formatado em Percentual: " + percentual.format(valorPercentual));
        System.out.println("----------");
        System.out.println("Valor Atual: " + valorInteiro);
        System.out.println("Valor Formatado: " + inteiro.format(valorInteiro));
        System.out.println("----------");
        System.out.println("Valor Atual: " + valorReal);
        System.out.println("Valor Formatado padrão: " + numberFormat.format(valorReal));
    }
}