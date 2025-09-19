/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumnog
 */
 //getters y setters
public class Pokemon {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the dano
     */
    public double getDano() {
        return dano;
    }

    /**
     * @param dano the dano to set
     */
    public void setDano(double dano) {
        this.dano = dano;
    }

    /**
     * @return the vida
     */
    public double getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(double vida) {
        this.vida = vida;
    }

    /**
     * @return the evolucion
     */
    public String getEvolucion() {
        return evolucion;
    }

    /**
     * @param evolucion the evolucion to set
     */
    public void setEvolucion(String evolucion) {
        this.evolucion = evolucion;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    //atributos
    private String nombre;
    private String tipo;
    private double dano;
    private double vida;
    private String evolucion;
    private String genero;
    
   
    //constructor
    
    public Pokemon(){
    
    }
    
    
    

    public Pokemon(String nombre, String tipo, double dano, double vida, String evolucion, String genero) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.dano = dano;
        this.vida = vida;
        this.evolucion = evolucion;
        this.genero = genero;
    }
   //métodos 

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", tipo=" + tipo + ", dano=" + dano + ", vida=" + vida + ", evolucion=" + evolucion + ", genero=" + genero + '}';
    }
    
}
