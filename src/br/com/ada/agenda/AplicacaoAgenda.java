package br.com.ada.agenda;

import java.util.*;

public class AplicacaoAgenda {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.inserir("Juliana Aquino", new Telefone("21", "999999999"));
        agenda.inserir("Juliana Aquino", new Telefone("21", "999999991"));
        agenda.imprimir();
    }
}