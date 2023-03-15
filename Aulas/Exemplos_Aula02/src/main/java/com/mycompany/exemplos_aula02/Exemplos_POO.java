/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplos_aula02;

import Formas.Forma;
import Formas.Quadrado;
import Formas.Triangulo;
import Formas.Circulo;

/**
 *
 * @author Gi
 */
public class Exemplos_POO {

    public static void main(String[] args) {
        Circulo circulo = new Circulo("circulo");
        Quadrado quadrado = new Quadrado("quadrado", 10, 10, 10);
        Triangulo triangulo = new Triangulo("triangulo");
//       Eh possivel chamar todos os metodos e alguns por acesso direto (porque nao possuem o metodo get)
        System.out.println("""
                           Circulo: %s
                           Area: %f
                           Perimetro: %f
                           Raio: %f
                           """.formatted(circulo.getNome(), circulo.getArea(), circulo.perimetro, circulo.raio));
        System.out.println("""
                           Quadrado: %s
                           Area: %f
                           Perimetro: %f
                           Lado: %f
                           """.formatted(quadrado.getNome(), quadrado.getArea(), quadrado.perimetro, quadrado.getLado()));
        System.out.println("""
                           Triangulo: %s
                           Area: %f
                           Base: %f
                           Altura: %f
                           """.formatted(triangulo.getNome(), triangulo.getArea(), triangulo.getBase(), triangulo.getAltura()));
//        Downcasting
        Forma circuloDowncasting = new Circulo("teste");
        System.out.println(((Circulo) circuloDowncasting).area());
//        Upcasting
        System.out.println(((Forma) circulo).area());
    }
}
