/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Willian Murayama
 */
public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<>();

    public void AdicionarLivro(String nome, String descricao, int quantidade) {
        livros.add(new Livro(nome, descricao, quantidade));
    }

    public String toString() {
        String dados = "";
        for (Livro livro : livros) {
            dados = dados + """
                            Nome: %s
                            Descrição: %s
                            Quantidade: %d
                            
                            """.formatted(livro.getNome(), livro.getDescricao(), livro.getQuantidade());
        }
        return dados;
    }
}
