import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
 
public class Percorre_Collections {
 
    public static void main(String[] args) {
        Collection<String> vogais = new ArrayList();
        vogais.add("A");
        vogais.add("E");
        vogais.add("I");
        vogais.add("O");
        vogais.add("U");
 
        //PERCORRE TODOS OS ELEMENTOS DA COLE��O VOGAIS
        for(String vog : vogais){
            System.out.println("Vogal: "+vog);
        }
    }
}