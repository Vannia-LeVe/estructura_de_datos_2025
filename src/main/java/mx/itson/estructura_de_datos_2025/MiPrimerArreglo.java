/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.estructura_de_datos_2025;

/**
 *
 * @author vanny
 */
public class MiPrimerArreglo {
    public static void main(String[]args){
        /*
        [] corchetes
        podemos guardar multiples elementos
        indice base 0
        se puede acceder a cualquier elementos por su indice
        tipo_dato [] nombre_variable; 
        su tamaño esta definido nunca cambia
        */
    
        String [] ciudades= {"Guaymas", "Empalme", "Cajeme", "Hermosillo", "Navojoa", "Naco"};
    
        System.out.println(ciudades[4]);
        System.out.println(ciudades[5]);
        ciudades[5]= "Magdalena";
        System.out.println(ciudades[5]);
        System.out.println(ciudades.length);
    
        for(String ciudad : ciudades){
            System.out.println("Ciudad: "+ciudad);
        }
        
        for(int i=0;i < ciudades.length; i++){
            System.out.println("Ciudad "+(i+1)+": "+ ciudades[i]);
        }
        String [] alumnos = new String[10];
        
        alumnos [5] = "Jose Anngel";
        
        for(String alumno : alumnos){
            System.out.println("Alumno; "+alumno);
        }
    }      
}
