/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listtest;

import java.util.ArrayList;

/**
 *
 * @author Josue
 */
public class ListTest {
    public static void main(String[] args) {
        //ArrayList es una coleccion para agregar elementos
        //y es de tamano dinamico. Puede ser utilizado en sistitucion
        //de un arreglo
        //Los elementos guardan el orden de insercion y pueden 
        //ser accedidos por indice
        ArrayList lista=new ArrayList();
        //Agregamos elementos por medio del metodo add
        lista.add(7);
        lista.add(1);
        lista.add(10);
        lista.add(666);
        lista.add(15);
        System.out.println("Lista: "+lista);
        System.out.println("Elemento 3 de la lista: "+lista.get(3));
        System.out.println("La lsita contiene el 13? "+lista.contains(13));
        System.out.println("La lsita contiene el 666? "+lista.contains(666));
        lista.set(2,800);
        System.out.println("Lista: "+lista);
        System.out.println("Tamanio de la lista: "+lista.size());
        //Podemos reconocer la lista con for mejorado
        //Imprimiendo lista:
        System.out.print("Lista ");
        for (Object object : lista){
               System.out.print(" "+object);
        }
        System.out.println(" ");
        //Las listas pueden ser ordenadas por medio de Collections.sort
        java.util.Collections.sort(lista);
        //Si necesitamos manejar la coleccion con un arreglo, se puede
        //convertir a arreglo con toArray()
        Object arr[]=lista.toArray();
        System.out.print("Lista Ordenada: ");
        for(int i=0; i<arr.length; i++)
            System.out.print(" "+arr[i]);
        System.out.println(" ");
        
    }
}
