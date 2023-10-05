package org.example;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class interfaceMap {
    public static void main(String[] args) {

        String text = "Este texto es un ejemplo es importante revisar cuantas veces aparece la word texto";
        text = text.toLowerCase(Locale.ROOT);

        String[] words = text.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for( String word: words){
            if( map.containsKey(word)){
                int valor = map.get(word) + 1;
                map.put(word, valor);
            }else {
                map.put(word,1);
            }
        }

        System.out.println(map);








    }
}
