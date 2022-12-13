package br.com.ada.agenda;

import java.util.*;

public class Agenda {
    private final Map<String, Set<Telefone>> contatos = new HashMap<>();

    public Optional<Set<Telefone>> buscar(String nome) {
        if (contatos.containsKey(nome)) {
            return Optional.of(contatos.get(nome));
        }
        return Optional.empty();
    }

    public void inserir(String nome, Telefone telefone) {
        Set<Telefone> telefones;
        if (contatos.containsKey(nome)) {
            telefones = contatos.get(nome);
            telefones.add(telefone);
        } else {
            telefones = new HashSet<>();
            telefones.add(telefone);
        }
        contatos.put(nome, telefones);
    }

    public void imprimir() {
        for (Map.Entry<String, Set<Telefone>> entry: contatos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
