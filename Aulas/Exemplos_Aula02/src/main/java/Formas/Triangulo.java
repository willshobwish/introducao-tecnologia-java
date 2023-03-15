/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formas;

/**
 *
 * @author Gi
 */
public class Triangulo extends Forma{
    float base;
    float altura;

    public Triangulo(String nome) {
        super(nome);
    }

    //Polimorfismo por sobreposição e sobregarca
    @Override
    public double area() {
        return base*altura/2;
    }
    
    //Polimorfismo por sobreposição e sobregarca
    public double area(float base, float altura){
        return base*altura/2;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    
}
