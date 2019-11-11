/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;

/**
 *
 * @author Jean_Lap
 */
public class Man extends SuperMan {
    private String nombre;
    private String edad;

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
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    private String run(){
    return "Man runs";    
    }
    
    private String walk(){
        return "Man Walks";
    }

    @Override
    public String superPower() {
        return "Man with Superman Power";
    }
}
