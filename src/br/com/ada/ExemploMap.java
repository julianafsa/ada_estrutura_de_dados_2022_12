package br.com.ada;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ExemploMap {

    public static void main(String[] args) {
//        int[] meuArray = new int[10];
//        meuArray[3] = 45;
//        System.out.println(meuArray[4]);
//
//        Integer[] meuArray2 = new Integer[10];
//        meuArray2[3] = 45;
//        System.out.println(meuArray2[4]);

//        ConcurrentMap<String, String> cmap = new ConcurrentHashMap<>();

        Map<String, Float> temperaturasCidades = new HashMap<>();
        temperaturasCidades.put("São Paulo", 22F);
        temperaturasCidades.put("Fortaleza", 21F);
        temperaturasCidades.put("Teresina", 27F);
        temperaturasCidades.put("Belo Horizonte", 24F);
        temperaturasCidades.put("Rio de Janeiro", 29F);
        temperaturasCidades.put("Teresina", 21F);

        System.out.println(temperaturasCidades.get("Teresina"));
        System.out.println(temperaturasCidades.get("Fortaleza"));

        Float temp = buscarTemperatura(temperaturasCidades, "São Paulo");

        imprimir(temperaturasCidades);

        imprimirTemperaturas(temperaturasCidades);

        imprimirCidades(temperaturasCidades);

    }

    public static List<String> buscarCidade(Map<String, Float> temperaturasCidades, Float temp) {
        List<String> cidades = new ArrayList<>();
        for (String chave: temperaturasCidades.keySet()) {
            Float temperatura = temperaturasCidades.get(chave);
            if (temp.equals(temperatura)) {
                cidades.add(chave);
            }
        }
        return cidades;
    }

    public static Float buscarTemperatura(Map<String, Float> temperaturasCidades, String cidade) {
        if (temperaturasCidades.containsKey(cidade)) {
            Float temp = temperaturasCidades.get("Teresina");
//            System.out.println(temp.doubleValue());
            return temp;
        } else {
            System.out.println("Chave inválida");
            return null;
        }
    }

    public static void imprimirCidades(Map<String, Float> temperaturasCidades) {
        for (String cidade: temperaturasCidades.keySet()) {
            System.out.println(cidade);
        }
    }

    public static void imprimirTemperaturas(Map<String, Float> temperaturasCidades) {
        for (Float temp:
                temperaturasCidades.values()) {
            System.out.println(temp);
        }
    }

    public static void imprimir(Map<String, Float> temperaturasCidades) {
//        final Set<String> chaves = temperaturasCidades.keySet();
//        for (String key: chaves) {
//            System.out.print(key + " - ");
//            Float temp = temperaturasCidades.get(key);
//            System.out.println(temp);
//        }

        for (Map.Entry<String, Float> entry: temperaturasCidades.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
