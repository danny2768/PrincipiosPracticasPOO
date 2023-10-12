package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> miLista = new ArrayList<Double>();
        miLista.add((3.5));
        miLista.add((4.5));
        miLista.add((5.5));
        miLista.add((6.5));

//        Iterator<Double> it = miLista.iterator();
//        while (it.hasNext()) {
//            Double ele = it.next();
//            System.out.println(ele);
//            if (ele < 5.0)
//                it.remove();
//        }
//

//        for (Double d : miLista) {
//            System.out.println(d);
//            if (d < 5.0) {
//                miLista.remove(d);
//            }
//        }

        for( int i = 0; i < miLista.size(); i++){
            System.out.println(miLista.get(i));
            if (miLista.get(i) < 5.0){
                miLista.remove(i);
            }
        }

        System.out.println(miLista);




    }
}