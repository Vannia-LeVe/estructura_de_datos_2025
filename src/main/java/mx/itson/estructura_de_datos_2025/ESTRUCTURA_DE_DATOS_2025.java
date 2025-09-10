/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.estructura_de_datos_2025;

/**
 *
 * @author vanny
 */
public class ESTRUCTURA_DE_DATOS_2025 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //ENTEROS 
        byte  diaMes = 10;
        
        short anio = 2025;
        
        int edad = 20;
        
        long granosArena = 1000000000000L;
        
        //NUMER0S DECIMALES 
        float precio = 250.50f; // hasta 7 decimales
        
        double pi = 3.141592; // hasta 15 decimales
        
        char grupo = 'c'; // un solo caracter entre ' '
        
        boolean activo = true; // valor true o falso 
                
        String nombre = "Arturo Saiza"; // Cadena de caracteres entre comillas dobles
        char inicial = nombre.charAt(0);
        System.out.println("la inicial es: "+inicial);
        /*
        System.out.println("Nombre: "+nombre);
        System.out.println("dia mes:"+diaMes);
        System.out.println("año: "+anio);
        System.out.println("edad: "+edad);
        System.out.println("granos de arena: "+granosArena);
        System.out.println("precio: "+precio);
        System.out.println("pi: "+pi);
        System.out.println("grupo: "+grupo);
        System.out.println("activo: "+activo);
        */
        
            //longitud de el valor de la variable
            //nombre = "arturo garcia zaiza";
            System.out.println(nombre.length());
            System.out.println(nombre.charAt(0));
            System.out.println(nombre.charAt(nombre.length()-1));
            
            String contrasena = "1234";
            // equals se usa para comparar string y no se debe usar el == para comparar string
            if(contrasena.equals("1234")){
                System.out.println("Bienvenido al sistema");
            }else{
               System.out.println("Contraseña invalida");
            }
            // no importa si es mayuscula o minuscula lo mismo que el de arriba pero mas flexible
            String usuario = "abelito";
            
            if(usuario.equalsIgnoreCase("abelitO")){
                System.out.println("Usuario correcto");
            }else{
               System.out.println("El usuario no existe");
            }
               
            // tranformacion
            // convertir a mayuscula
            System.out.println(nombre.toUpperCase());
            //convertir a minuscula 
            System.out.println(nombre.toLowerCase());
            //eliminar espacios al principio y al final
            System.out.println(nombre.trim());
            
            String correo = "arturogsaiza@gmail.com";
            
            //es gmail
            //termine en .com
            //que tenga arroba @
            
            //cibtains busca una comparacion para verificar que este
            if(correo.contains("gmail")&& correo.endsWith(".com")){
                System.out.println("correo valido");
            }else{
               System.out.println("correo invalido xxxxx");
            }
            // regresa la indice
            System.out.println(correo.indexOf("8"));
            
            System.out.println(correo.startsWith("Kinberly"));
            
            //extraccion
            // vamos a obtener una parte del strimg el primer clase.sustring dice de una cantidad hasta otra cantidad
            // el segundo dice de cierta cantidad hasta adelantes 
            String clase = "EstructuraDeDatos";
            String palabra1= clase.substring(0,10);
            String palabra2= clase.substring(10);
            
            System.out.println("palabra original "+clase);
            System.out.println("palabra1 "+palabra1);
            System.out.println("palabra2 "+palabra2);
            
            //remplazar caracteres
            String itson = "INSTITUTO TECNOLOGICO DE SONORA";
            
            // remplaza letras osea "T" esta ciendo remplazado por "L"
            // se puede utilizar para eliminar espacios o como quieras
            /*
            String itson2 = itson.replace(" ","-");
            itson2 = itson2.replace("T","L");
            itson2 = itson2.replace("A","E");
            System.out.println(itson2);
            */
            //remprazar muchos por uno
            System.out.println(itson.replaceAll("[AEIOUaeiou]","*"));
            
            String palabra3 = "Hola Mundo";
            
            System.out.println(palabra3.replace("Mundo", "terricolas"));
            
            String nombres = "Lupita-Maria-Juana-Josefina-JoseAngelCastro";
            
            String [] listaNombre = nombres.split ("-");
            
            System.out.println("1: "+listaNombre[0]);
            System.out.println("2: "+listaNombre[1]);
            System.out.println("3: "+listaNombre[2]);
            System.out.println("4: "+listaNombre[3]);
            System.out.println("5: "+listaNombre[4]);
            System.out.println("6: "+listaNombre[5]);
            
    }
}
