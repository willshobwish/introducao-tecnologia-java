/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadethread;

/**
 *
 * @author Willian
 */
public class Caixa implements Runnable {

    private double valor;
    private Fila fila;

    public Caixa(String nome, double valor, Fila fila) {
        this.valor = valor;
        this.fila = fila;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        operacao(this.fila);
        System.out.println("""
                           Valor final do caixa R$%.2f
                           """.formatted(getValor()));
    }

    public void operacao(Fila fila) {
        int iteracao = 1;
        for (Cliente eachClient : fila.getClientes()) {
            if (eachClient.isSaque()) {
                saque(eachClient.getValor());
                System.out.println("""
                                   Cliente %d sacou R$%.2f
                                   """.formatted(iteracao, eachClient.getValor()));
            } else {
                setValor(getValor() + eachClient.getValor());
                System.out.println("""
                                   Cliente %d depositou R$%.2f
                                   """.formatted(iteracao, eachClient.getValor()));
            }
            iteracao++;
        }
    }

    public void saque(double valor) {
        if (valor > getValor()) {
            System.out.println("Valor indisponivel");
        } else {
            setValor(getValor() - valor);
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
