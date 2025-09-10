/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.estructura_de_datos_2025;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author alumnog
 */
public class Colas {
    public static void main(String[] args) {
        
        
        Queue<String> colaaOxxo = new LinkedList<> ();
        colaaOxxo.add("Vanessa 4k");
        colaaOxxo.add("Paolaaaaaaaaaaa");
        colaaOxxo.add("Lic Karina");
        colaaOxxo.add("Juania");
        colaaOxxo.add("Jota");
        
        
        //Va tomando siempre el primero de la fila
        System.out.println("Atiemdo a: " +colaaOxxo.peek());
        System.out.println(colaaOxxo);
        
        System.out.println("Despachando a: " +colaaOxxo.poll());
        System.out.println(colaaOxxo);
        
        while(!colaaOxxo.isEmpty()){
            System.out.println("Despachando a :" + colaaOxxo.poll());
        }
        
    }
    
}

