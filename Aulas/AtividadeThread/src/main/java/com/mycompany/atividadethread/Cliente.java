/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadethread;

import java.util.Random;

/**
 *
 * @author Willian
 */
public class Cliente {

    private boolean saque;
    private double valor;
    private double min = 0;
    private double max = 100;

    public Cliente() {
        Random rd = new Random();
        this.saque = rd.nextBoolean();
        this.valor = min + (max - min) * rd.nextDouble();;
    }

    public boolean isSaque() {
        return saque;
    }

    public void setSaque(boolean saque) {
        this.saque = saque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

}
