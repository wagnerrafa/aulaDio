package digitalinnovation.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.InflaterOutputStream;

public class HashSet {
    public static void main(String[] args){
        Set<Double> notasAluno = new java.util.HashSet<>(); //nao mantem a ordem de insercao
        notasAluno.add((double) 4);
        notasAluno.add(2.);
        notasAluno.add(23.);
        notasAluno.add(14.);
        notasAluno.add(55.);

        notasAluno.add(44.);
        System.out.println(notasAluno);

        Iterator<Double> iterator = notasAluno.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
