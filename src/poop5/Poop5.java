/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 * La clase principal del programa donde se crean instancias de diferentes objetos
 * (como un Pokémon) y se realizan acciones que demuestran el funcionamiento de las
 * clases creadas. En este caso, se crea un Pokémon y se interactúa con él usando
 * varios métodos definidos en la clase `Pokemon`.
 * 
 * @author evare
 */
public class Poop5 {

    /**
     * Método principal donde se crean y manipulan objetos de la clase `Pokemon` 
     * y se muestran sus interacciones.
     * 
     * @param args Los argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        // Crear un objeto Circulo y establecer su radio
        Circulo circulo = new Circulo();
        circulo.setRadio(2f);

        // Calcular y mostrar el perímetro y área del círculo
        System.out.println("Perimetro = "+ circulo.calcularPerimetro());
        System.out.println("Area = "+ circulo.calcularArea());

        // Cambiar el radio y mostrar los nuevos resultados
        circulo.setRadio(10f);
        System.out.println("Perimetro = "+ circulo.calcularPerimetro());
        System.out.println("Area = "+ circulo.calcularArea());

        // Probar con un valor negativo para el radio
        circulo.setRadio(-33f);
        System.out.println("Perimetro = "+ circulo.calcularPerimetro());
        System.out.println("Area = "+ circulo.calcularArea());

        // Crear instancias de Pokémon y realizar interacciones
        System.out.println("***** CLASE POKEMON *****");
        
        // Crear un Pokémon llamado Pikachu
        Pokemon pikachu = new Pokemon("Pikachu");
        pikachu.atacar();  // El Pokémon ataca
        pikachu.usarObjeto("Poción");  // El Pokémon usa un objeto
        pikachu.rendirse();  // El Pokémon se rinde
        pikachu.defender();  // El Pokémon se defiende

        // Crear otro Pokémon llamado Charmander
        Pokemon charmander = new Pokemon("Charmander");
        charmander.atacar();  // Charmander ataca
        charmander.usarObjeto("Baya");  // Charmander usa un objeto
        charmander.rendirse();  // Charmander se rinde
        charmander.defender();  // Charmander se defiende
    }
}
