/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.estructura_de_datos_2025;

import java.util.Stack;

/**
 *
 * @author alumnog
 */
public class Pila {
    public static void main(String[] args) {
        //Pila: ultimo elemento que entra es el primero que sale
        
        Stack pila= new Stack();//pila de objetos
        Stack colores = new Stack<String>();// pila de string
        
        //agregar elementos
        colores.push("BLANCO");
        colores.push("AZUL");
        colores.push("MORADO");
        colores.push("ROSA");
        colores.push("LILA");
        colores.push("ROJO");
        colores.push("CIAN");
        
        System.out.println(colores);
        
        //CONSULTAR EL SIGUENTE ELEMNTO
        System.out.println("SIGUIENTE: "+colores.peek());
        // SACAR ELEMENTO SIGUIENTE DE LA LISTA
        System.out.println("ELIMADO: "+ colores.pop());
        System.out.println(colores);
        
        //vaciar pila
        colores.clear();
        // REVISAR SI UNA PILA ESTA VACIA  O NO

        if(colores.isEmpty()){
            System.out.println("PILA VACIA");
        }else {
            System.out.println("LA PILA TIENE ELEMENTOS");
        }
        
    }
}
