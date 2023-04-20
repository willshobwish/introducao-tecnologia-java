/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadethread;

import java.util.ArrayList;

/**
 *
 * @author Willian
 */
public class Fila implements Runnable {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    public Fila(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            clientes.add(new Cliente());
        }
    }

    public void run() {
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

}
