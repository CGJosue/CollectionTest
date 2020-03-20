/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listtest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Josue
 */
public class ListTest2 {
    public static void main(String[] args) {
        ArrayList lista=new ArrayList();
        
        lista.add(16);
        lista.add(1);
        lista.add("Nicanor");
        lista.add(true);
        lista.add(666);
        lista.add(3.1416);
        lista.add(new Fecha(16,15,1810));
        System.out.println("Lista: "+lista);
        //Ordenamos la lista
        
        //Como es heterogenea, no se puede ordenar
        //java.util.Collections.sort(lista);
        
        System.out.println("Lista Ordenada:"+lista);
        //Hacemos una lista, forzando a que sea homogenea
        //Utilizando la especificacion del "generico".
        //El mecanismo de "genericos" es igual al de plantillas de c++
        
        //Si no se especifica el tipo del generico, se asume que es object
        
        ArrayList<String> lista2=new ArrayList();
        
        lista2.add("Pera");
        lista2.add("Manzana");
        lista2.add("Bush es culpable del 911");
        lista2.add("Osama Bin Laden");
        lista2.add("todo es una cortina de humo");
        
        //imprimimos la lista 
        
        Iterator<String> it=lista2.iterator();
        while(it.hasNext()){
            System.out.print(" "+it.next());
        }
        System.out.println(" ");
        
    }
}
