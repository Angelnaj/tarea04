/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea04;

/**
 *
 * @author angel
 */
public class Tarea04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        
        System.out.println("programa ejemplo de la lista");
        
        lista.agregarAlFinal(23);
        lista.agregarAlFinal(15);
        lista.agregarAlFinal(54);
        lista.agregarAlFinal(11);
        lista.agregarAlFinal(80);
       
        System.out.println("***** Visualizacion de datos *****");
        System.out.println("¿la lista està vacia?");
        System.out.println(lista.esVacio());
        lista.listar();
        System.out.println("el tamaño de la lista es: "+lista.getTamanio());
        
        lista.removerUltimaPosicion();
        System.out.println("***** Visualizacion de datos *****");
        System.out.println("¿la lista està vacia?");
        System.out.println(lista.esVacio());
        lista.listar();
        System.out.println("el tamaño de la lista es: "+lista.getTamanio());
        
        lista.removerUltimaPosicion();
        System.out.println("***** Visualizacion de datos *****");
        System.out.println("¿la lista està vacia?");
        System.out.println(lista.esVacio());
        lista.listar();
        System.out.println("el tamaño de la lista es: "+lista.getTamanio());
        
        lista.eliminar();
        System.out.println("***** Visualizacion de datos *****");
        lista.listar();
        System.out.println("¿la lista està vacia?");
        System.out.println(lista.esVacio());
        System.out.println("La lista ha sido eliminada con exito");
        
    }
    
}
