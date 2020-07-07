package digitalinnovation.set;

import java.util.TreeSet;

public class treeSett {
    public static void main(String[] args){
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("porto alegre");
        treeCapitais.add("florianopolis");
        treeCapitais.add("curitiba");
        treeCapitais.add("sao paulo");
        treeCapitais.add("rio de janeiro");

        System.out.println(treeCapitais);


        System.out.println("primeria no topo: " + treeCapitais.first());
        System.out.println("ultima: " + treeCapitais.last());
        System.out.println("primeira abaixo do valor passado: " + treeCapitais.lower("florianopolis"));
        System.out.println("primeira acima do valor passado: " + treeCapitais.higher("florianopolis"));
        System.out.println("primeira do topo e removendo ela: " + treeCapitais.pollFirst());
        System.out.println("ultima e removendo ela: " + treeCapitais.pollLast());
        System.out.println("todos os dados: " + treeCapitais);




    }
}
