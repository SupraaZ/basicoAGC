/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoagc;

/**
 *
 * @author Adrian
 */
public class BasicoAGC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        numerico();
        cadenas();
        logico(7);


    }

    private static void numerico() {
        System.out.println("Valor numerico esperado");
        //Aquí se ubicará la operación númerica.
        
    }

    private static void cadenas() {
        System.out.println("Mi nombre es Adrián Granero");
    }
    private static void logico (int a){
        if (a < 10){
            System.out.println(a + " Es menor que 10");
        }
        else{
            System.out.println(a + "Es mayor que 10");
                 
        }
    }
}
