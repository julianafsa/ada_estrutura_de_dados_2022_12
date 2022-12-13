package br.com.ada;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OutrosMaps {

    public static void main(String[] args) {
        Map<String, Integer> idades = new LinkedHashMap<>();
        idades.put("Ana", 18);

        Map<String, Float> notas = new TreeMap<>();
        notas.put("Matematica", 10F);

    }
}
