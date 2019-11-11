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
public class Practica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Man mn = new Man();
        Man[] m = new Man[5];
        int[] i = new int[15];
        String[] s = new String[10];
        
        for (int j = 0; j < 5; j++) {
            m[j] = new Man();
            m[j].setEdad("23");
            m[j].setNombre("Carlitos" + Integer.toString(j));
        }
        Man[] r = ImprimeArreglo(m);
        ImpArreglo(r);
    }
    public static Man[] ImprimeArreglo(Man[] m){
        return m;
    }
  
    public static void ImpArreglo (Man[] m){
        for (Man n:m)
        {
      System.out.println(n.getNombre() + " " + n.getEdad() + " " +n.JumpHigher()+"\n");
        }
    }
}
