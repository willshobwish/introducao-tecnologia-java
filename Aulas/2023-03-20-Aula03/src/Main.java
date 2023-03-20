
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Willian Murayama
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Podemos criar uma lista de compras
        System.out.println("Array List");
        ArrayList<String> compras = new ArrayList<>();
        compras.add("leite");
        compras.add("cereal");
        compras.add("oleo");
        compras.add("peixe");
        compras.add("alface");
        compras.remove(0);
        compras.remove(compras.size() - 1);
        for (int i = 0; i < compras.size(); i++) {
            System.out.println(compras.get(i));
        }
//        Podemos utilizar listas encadeadas quando necessitamos reordenar a lista grande ou  constantemtente, assim podemos poupar poder computacional
        System.out.println("Linked List");
        LinkedList<String> nomes = new LinkedList<>();
        nomes.add("Ana");
        nomes.add("Gabriel");
        nomes.add("Maria");
        nomes.add("Guilherme");
        nomes.add("Joao");
        nomes.remove(0);
        nomes.remove(nomes.size() - 1);
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
//        Quando necessitamos manipular dados criticos que não podem ser acessados por multiplos threads (nao tinha um exemplo melhor, infelizmente)
        System.out.println("Vector");
        Vector<String> cpf = new Vector<>();
        cpf.add("001");
        cpf.add("002");
        cpf.add("003");
        cpf.add("004");
        cpf.add("005");
        cpf.remove(0);
        cpf.remove(cpf.size() - 1);
        for (int i = 0; i < cpf.size(); i++) {
            System.out.println(cpf.get(i));
        }
//A pilha utiliza o LIFO, portanto eh util quando queremos representar uma fila de chegada
        System.out.println("Stack");
        Stack<Integer> fila = new Stack<>();
        fila.push(1);
        fila.push(2);
        fila.push(3);
        fila.push(4);
        fila.push(5);
        fila.remove(0);
        fila.pop();
        for (int i = 0; i < fila.size(); i++) {
            System.out.println(fila.get(i));
        }
//        ArrayDeque representa uma fila que podemos acessar tanto pelo "comeco" e tanto pelo "final"
        System.out.println("ArrayDeque");
        ArrayDeque<String> filaPreferencial = new ArrayDeque<>();
        filaPreferencial.add("Sonia");
        filaPreferencial.add("Elisa");
        filaPreferencial.add("Joao");
        filaPreferencial.add("Marcos");
        filaPreferencial.add("Antonio");
        filaPreferencial.removeFirst();
        filaPreferencial.removeLast();
        for (int i = 0; i < filaPreferencial.size(); i++) {
            System.out.println(filaPreferencial.removeLast());
        }
//Podemos utilizar para verificar se o e-mail ja existe no cadastro do sistema
        System.out.println("HashSet");
        HashSet<String> emails = new HashSet<>();
        emails.add("a");
        emails.add("b");
        emails.add("c");
        emails.add("d");
        emails.add("e");
        emails.remove("a");
        emails.remove("e");
        Iterator<String> emailsIterator = emails.iterator();
        while (emailsIterator.hasNext()) {
            System.out.println(emailsIterator.next());
        }

//        Podemos utilizar para verificar se o nome ja existe
        System.out.println("LinkedHashSet");
        LinkedHashSet<String> nomesUnicos = new LinkedHashSet<>();
        nomesUnicos.add("A1");
        nomesUnicos.add("A2");
        nomesUnicos.add("A3");
        nomesUnicos.add("A4");
        nomesUnicos.add("A5");
        nomesUnicos.remove("A1");
        nomesUnicos.remove("A5");
        Iterator<String> nomesUnicosIterator = nomesUnicos.iterator();
        while (nomesUnicosIterator.hasNext()) {
            System.out.println(nomesUnicosIterator.next());
        }
//        Eh uma estrutura de dado eficiente quando eh necessario muitas buscas
        System.out.println("TreeSet");

        TreeSet<Integer> ra = new TreeSet<>();
        ra.add(1);
        ra.add(2);
        ra.add(3);
        ra.add(4);
        ra.add(5);
        ra.remove(ra.first());
        ra.remove(ra.last());
        Iterator<Integer> raIterator = ra.iterator();
        while (raIterator.hasNext()) {
            System.out.println(raIterator.next());
        }
//        Quando necessitamos atribuir chave para cada valor em uma lista
        System.out.println("HashMap");
        HashMap<Integer, String> nomeValor = new HashMap<>();
        nomeValor.put(0, "Jose");
        nomeValor.put(1, "Marcos");
        nomeValor.put(2, "Leon");
        nomeValor.put(3, "Nilce");
        nomeValor.put(4, "Carol");
        nomeValor.remove(0);
        nomeValor.remove(nomeValor.size() - 1);
        for (int i = 0; i < nomeValor.size(); i++) {
            System.out.println("""
                               Chave: %d
                               Valor: %s
                               """.formatted(i, nomeValor.get(i)));
        }
    }

}
