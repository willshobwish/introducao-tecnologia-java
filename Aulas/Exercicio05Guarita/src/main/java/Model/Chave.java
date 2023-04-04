/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Willian Murayama
 */
public class Chave implements Serializable {

    private String codigo;
    private String laboratorio;
    private int quantidadeDeAluno;

    public Chave(String nome, String descricao, int quantidade) {
        this.codigo = nome;
        this.laboratorio = descricao;
        this.quantidadeDeAluno = quantidade;
    }

    public String getNome() {
        return codigo;
    }

    public void setNome(String nome) {
        this.codigo = nome;
    }

    public String getDescricao() {
        return laboratorio;
    }

    public void setDescricao(String descricao) {
        this.laboratorio = descricao;
    }

    public int getQuantidade() {
        return quantidadeDeAluno;
    }

    public void setQuantidade(int quantidade) {
        this.quantidadeDeAluno = quantidade;
    }

}
