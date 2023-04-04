/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Guarita;

/**
 *
 * @author Willian Murayama
 */
public class Controller {

    private static Guarita biblioteca = new Guarita();

    public Controller() {
    }

    public void CadastrarLivro(String nome, String descricao, int quantidade) {
        biblioteca.AdicionarLivro(nome, descricao, quantidade);
    }

    public void salvarLivros() {
        biblioteca.saveFile();
    }

    public String toString() {
        return biblioteca.toString();
    }

}
