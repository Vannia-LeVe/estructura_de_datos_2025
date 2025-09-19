
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumnog
 */
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> listaPokemons = new ArrayList<String> ();
        listaPokemons.add("Pikachu");
        listaPokemons.add("Charmender");
        listaPokemons.add("Squirtle");
        listaPokemons.add("Chicorita");
        listaPokemons.add("Charmender");
        listaPokemons.add("Miau");
        System.out.println(listaPokemons);
        
        //.get consultar una posición
        System.out.println(listaPokemons.get(4));
        listaPokemons.remove(3);
        System.out.println(listaPokemons);
        listaPokemons.set(2,"SuperPichu" );
        System.out.println(listaPokemons);
        listaPokemons.add(3,"Snorglax" );
        System.out.println(listaPokemons);
        
       //listaPokemons.clear();
        System.out.println(listaPokemons.size());
        
       //interar con for
       for( int i=0;i<listaPokemons.size();i++){
           System.out.println("Pokemon: " +i +".- "+listaPokemons.get(i));
           
           
           //for each
           for( String Pokemon: listaPokemons){
               System.out.println(Pokemon);
       }
       }
        
    }
 
}
