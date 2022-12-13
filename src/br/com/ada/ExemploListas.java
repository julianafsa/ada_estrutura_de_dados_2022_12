package br.com.ada;

import java.util.*;

public class ExemploListas {

    public static void main(String[] args) {
        exemploArrayList();
    }

    public static void exemploLinkedList() {
        LinkedList<Aluno> linked = new LinkedList<>();
        linked.add(new Aluno("Aline", 20));
        linked.add(new Aluno("Alan", 30));
        linked.add(new Aluno("João", 21));

        imprimir(linked);

        imprimir2(linked);

    }

    private static void exemploArrayList() {
        List<Aluno> alunos = List.of(new Aluno("Aline", 20), new Aluno("Alan", 20));

        ArrayList<Aluno> arrayList = new ArrayList<Aluno>();
        arrayList.add(new Aluno("Aline", 20));
        arrayList.add(new Aluno("Allan", 20));
        arrayList.add(new Aluno("João", 20));
        arrayList.addAll(alunos);

        imprimir(arrayList);
    }

    public static boolean estaContido(Collection<Aluno> collection, Aluno aluno) {
        return collection.contains(aluno);
    }

    public static int buscar(List<Aluno> collection, Aluno aluno) {
        return collection.indexOf(aluno);
    }

    public static Aluno buscarPorInde(List<Aluno> collection, int indice) {
        return collection.get(indice);
    }

    private static void imprimir(Collection<Aluno> collection) {
        for (Aluno aluno: collection) {
            System.out.println(aluno);
        }
    }

    private static void imprimir2(Collection<Aluno> collection) {
        Iterator<Aluno> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Aluno a = iterator.next();
            System.out.println(a);
        }

    }
}

class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        Aluno aluno = (Aluno) obj;
//        return idade == aluno.idade && Objects.equals(nome, aluno.nome);
        if (!(obj instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) obj;
        return this.getNome().equals(other.getNome()) &&
                this.getIdade() == other.getIdade();
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }
}
