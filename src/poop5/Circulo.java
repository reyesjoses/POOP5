/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * La clase `Circulo` representa un círculo con un radio, y proporciona métodos para 
 * calcular el perímetro y el área del círculo. Además, permite modificar el radio 
 * y asegurar que el valor del radio siempre sea positivo, incluso si se introduce un 
 * valor negativo.
 * 
 * Esta clase también define un valor constante para PI (π), que se utiliza en los cálculos.
 * 
 * @author evare
 */
public class Circulo {
    
    // Atributo para almacenar el radio del círculo
    private float radio;
    
    // Constante para PI (π), utilizada en los cálculos de área y perímetro
    final float PI = (float)Math.PI;

    /**
     * Constructor vacío que crea un círculo sin especificar un valor para el radio.
     */
    public Circulo() {
    }

    /**
     * Constructor que crea un círculo con un valor específico para el radio.
     * 
     * @param radio El valor del radio inicial del círculo.
     */
    public Circulo(float radio) {
        this.radio = radio;
    }

    /**
     * Método para establecer el valor del radio. Si se ingresa un valor negativo, 
     * se convierte automáticamente a su valor absoluto.
     * 
     * @param radio El valor del radio que se quiere establecer.
     */
    public void setRadio(float radio){
        this.radio = Math.abs(radio); // Asegura que el radio sea positivo
    }

    /**
     * Método que calcula el perímetro del círculo usando la fórmula:
     * Perímetro = 2 * PI * radio
     * 
     * @return El perímetro calculado del círculo.
     */
    public float calcularPerimetro(){
        return (2 * PI * radio);
    }

    /**
     * Método que calcula el área del círculo utilizando la fórmula:
     * Área = PI * radio^2
     * 
     * @return El área calculada del círculo.
     */
    public float calcularArea(){
        return (float) (PI * Math.pow(radio, 2));
    }

    /**
     * Método para obtener el valor de la constante PI.
     * 
     * @return El valor de PI.
     */
    public float getPi(){
        return PI;
    }
}
