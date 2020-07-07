package digitalinnovation.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class exampleHashMap { //mais performance, permite ordenação utilizando parenteses em alguns casos
    public static void main(String[] args) {
        Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();
        campeoesMundiaisFifa.put("brasil", 5); //put recebe dois argumentos
        campeoesMundiaisFifa.put("alemanha", 4);
        campeoesMundiaisFifa.put("italia", 4);
        campeoesMundiaisFifa.put("uruguai", 2);
        campeoesMundiaisFifa.put("argentina", 2);
        campeoesMundiaisFifa.put("frança", 2);
        campeoesMundiaisFifa.put("inglaterra", 1);
        campeoesMundiaisFifa.put("espanha", 1);
        System.out.println("campeoes: " + campeoesMundiaisFifa);

        System.out.println("teste agora" + campeoesMundiaisFifa.get("inglaterra"));


        campeoesMundiaisFifa.put("brasil", 6);  // put servve para atualizar a chave
        System.out.println("atualizaçao do brasil: " + campeoesMundiaisFifa);

        System.out.println(campeoesMundiaisFifa.containsKey("franca")); // verificar se tem o argumento passado
        System.out.println(campeoesMundiaisFifa.containsValue(6));

        for(Map.Entry<String, Integer> entry : campeoesMundiaisFifa.entrySet()){ //navegar nos registros
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
    }
}
