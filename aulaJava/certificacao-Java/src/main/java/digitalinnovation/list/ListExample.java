package digitalinnovation.list;

import digitalinnovation.classes.usuario.SuperUsuario;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();
        nomes.add("wagner"); //inclui um valor na lista
        nomes.add("joao");
        nomes.add("maria");
        nomes.add("rafael");

        nomes.set(1, "JOAO"); //troca o valor na posicao escolhida
        System.out.println("nomes da lista: " + nomes);

        Collections.sort(nomes); //ordenação alfabetica
        System.out.println("nomes em ordem alfabetica: " + nomes);

        nomes.remove(2); //remover por numero de indice
        System.out.println("lista com indice 2 removiddo: " + nomes);

        nomes.remove("JOAO");  //remover por objeto da lista
        System.out.println("lista com nome removido por objeto: " + nomes);

        String nome = nomes.get(1); //pegar o elemento do indice passado e coloca-lo numa variavel
        System.out.println("nome escolhido por indice: " + nome);

        int tamanho = nomes.size(); //saber o tamanho da lista
        System.out.println("tamanho da lista: " + tamanho);

        if (nomes.contains("wagneer") == true){ //verficar se tem o valor passado na lista
            System.out.println("verificando se tem o nome na lista: contem");
        }
        else {
            System.out.println("verificando se tem o nome na lista: nao contem");
        }

        boolean temNome = nomes.contains("wagner"); //outra forma de verificar, e retorna um booleano
        System.out.println("verificando se tem o nome na lista: " + temNome);

        boolean listaVazia = nomes.isEmpty(); //verificar se a lista está vazia
        System.out.println("verificando se tem valores na lista: " + listaVazia);

        System.out.println("buscando o indice que está o nome: " + nomes.indexOf("wagner"));

        for(String nomeLista: nomes){
            System.out.println("os nomes na lista: " + nomeLista);
        }
        nomes.clear(); //limpar lista
        listaVazia = nomes.isEmpty();
        System.out.println("verificando se tem valores na lista: " + listaVazia);
    }
}
