/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.atividadethread;

/**
 *
 * @author willm
 */
public class AtividadeThread {

    public static void main(String[] args) {
        Fila filaa = new Fila(5);
        Fila filab = new Fila(5);

        Caixa caixa = new Caixa("a", 200, filaa);

        caixa = new Caixa("b", 200, filab);

    }
}
