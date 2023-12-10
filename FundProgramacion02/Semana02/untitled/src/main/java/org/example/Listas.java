package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> paises = new ArrayList<>();
        paises.add("Peru");
        paises.add("Chile");
        paises.add("España");
        //Iteración del arraylist
        Iterator<String> iterator = paises.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

        //For each
        for  (String obj:paises) {
            System.out.println(obj);

        }

    }
}
