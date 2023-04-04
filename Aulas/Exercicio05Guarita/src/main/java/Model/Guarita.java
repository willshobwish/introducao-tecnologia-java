/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Willian Murayama
 */
public class Guarita {

    private ArrayList<Chave> chaves = new ArrayList<>();
    private final String filepath = "src/main/java/Save/chaves.ser";

    public Guarita() {
        try {
            FileInputStream file = new FileInputStream(filepath);
            ObjectInputStream input = new ObjectInputStream(file);
            chaves = (ArrayList<Chave>) input.readObject();
            input.close();
            file.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Não foi encontrado o arquivo");
            c.printStackTrace();
            return;
        }
    }

    public void AdicionarLivro(String nome, String descricao, int quantidade) {
        chaves.add(new Chave(nome, descricao, quantidade));
    }

    public void saveFile() {
        try {
            FileOutputStream file = new FileOutputStream(filepath);
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(chaves);
            output.close();
            file.close();
            System.out.printf("Salvo com sucesso");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public String toString() {
        String dados = "";
        for (Chave livro : chaves) {
            dados = dados + """
                            Código da chave: %s
                            Laboratório: %s
                            Quantidade de alunos no laboratório: %d

                            """.formatted(livro.getNome(), livro.getDescricao(), livro.getQuantidade());
        }
        return dados;
    }

}
