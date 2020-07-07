package digitalinnovation.set;

import java.util.LinkedHashSet;

public class LinkedSet {
    public static void main(String[] args){
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(5); //mante a ordem de inserção
        sequenciaNumerica.add(6);
        sequenciaNumerica.add(7);
        sequenciaNumerica.add(4);
        System.out.println(sequenciaNumerica);
    }
}

