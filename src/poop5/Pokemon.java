/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * La clase `Pokemon` representa un Pokémon con un nombre y varios métodos para simular 
 * acciones comunes que realizaría un Pokémon en un juego o batalla.
 * 
 * Métodos como atacar, defender, usar objetos y rendirse simulan diferentes comportamientos 
 * de un Pokémon, y también se incluye la posibilidad de imprimir su nombre para mostrarlo 
 * en las interacciones con el usuario.
 * 
 * @author evare
 */
public class Pokemon {
    
    // Atributo para almacenar el nombre del Pokémon
    String nombre;

    /**
     * Constructor vacío que crea un Pokémon sin un nombre inicial.
     */
    public Pokemon() {}

    /**
     * Constructor que permite crear un Pokémon con un nombre específico.
     * 
     * @param nombre El nombre del Pokémon.
     */
    public Pokemon(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para hacer que el Pokémon ataque a otro objetivo.
     */
    public void atacar() {
        System.out.println(nombre + " ha atacado a su oponente!");
    }

    /**
     * Método para hacer que el Pokémon use un objeto durante la batalla.
     * 
     * @param objeto El nombre del objeto que el Pokémon usará.
     */
    public void usarObjeto(String objeto) {
        System.out.println(nombre + " ha usado el objeto: " + objeto);
    }

    /**
     * Método para hacer que el Pokémon se rinda y se retire de la batalla.
     */
    public void rendirse() {
        System.out.println(nombre + " se ha rendido y está huyendo de la batalla.");
    }

    /**
     * Método para hacer que el Pokémon se defienda de un ataque.
     */
    public void defender() {
        System.out.println(nombre + " se está defendiendo del ataque.");
    }
}
