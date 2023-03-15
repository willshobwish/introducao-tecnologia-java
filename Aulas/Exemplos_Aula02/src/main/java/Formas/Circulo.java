/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formas;

/**
 *
 * @author Gi
 */
public class Circulo extends Forma {
    public float raio;

    public Circulo(String nome) {
        super(nome);
    }

//Polimorfismo por sobreposição e inclusão
    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
    
    
}

