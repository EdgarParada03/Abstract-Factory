/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.abstract_factory;

/**
 *
 * @author edgar
 * https://www.youtube.com/watch?v=7-OcoNDWV9A
 */
public class Abstract_Factory {

    public static void main(String[] args) {
        PersonajeFactory fabricaHeroe = new HeroeFactory();
        Personaje heroe = fabricaHeroe.crearPersonaje();
        //Arma espada = fabricaHeroe.crearArma();
        
        System.out.println(heroe.obtenerTipo());
        //System.out.println(espada.obtenerTipo());
        
        
        PersonajeFactory fabricaVillano = new VillanoFactory();
        Personaje villano = fabricaVillano.crearPersonaje();
        //Arma armaFuego = fabricaVillano.crearArma();
        
        System.out.println(villano.obtenerTipo());
        //System.out.println(armaFuego.obtenerTipo());
    }
}
