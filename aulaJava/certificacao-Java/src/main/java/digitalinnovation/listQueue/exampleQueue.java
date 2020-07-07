package digitalinnovation.listQueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class exampleQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("wagner");
        filaBanco.add("rafael");
        filaBanco.add("oliveira");
        filaBanco.add("farias");

        System.out.println("fila do banco: " + filaBanco);

        String clienteAtendido = filaBanco.poll(); // retorna e remove o primeiro da fila
        System.out.println("Cliente atendido: " + clienteAtendido);
        System.out.println("fila do banco: " + filaBanco);

        String primeiroCliente = filaBanco.peek();
        System.out.println("primeiro da fila: " + primeiroCliente); //retorna o primeiro mas nao remove
        String primeiroclienteOuErro = filaBanco.element(); //retorna o primerio cliente mas nao remove, e gera uma exception se nao tiver ninguem na lista
        System.out.println("primerio da fila ou exception: " + primeiroclienteOuErro);

    }
}








//        Scanner ler = new Scanner(System.in);     entrada de dados por input
//        String entrarFila = "s";

//        while (entrarFila.equals("s")) {
//            System.out.println("insira o nome da pessoa para entrar na fila: ");
//            filaBanco.add(ler.next());
//            System.out.println("inserir mais uma pessoa? s -sim, n - nao");
//            entrarFila = ler.next();
//        }
