package br.com.ada.agenda2;

import br.com.ada.agenda.Telefone;

import java.util.HashSet;
import java.util.Set;

public class Contato {
    private String nome;
    private Set<Telefone> telefones;

    public Contato(String nome, Telefone telefone) {
        this.nome = nome;
        this.telefones = new HashSet<>();
        this.inserir(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Telefone> getTelefones() {
        return telefones;
    }

    public void inserir(Telefone telefone) {
        this.telefones.add(telefone);
    }
}
