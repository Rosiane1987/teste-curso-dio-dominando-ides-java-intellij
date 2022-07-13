package br.com.dio;

import br.com.dio.model.Gato;

public class FirstProgram {
    public static void main(String[] args) {
        Gato gato = new Gato();

        Livro livro1 = new Livro("O problema dos 3 corps", 300);

        System.out.println(livro1);

       /* int a = 5;
        int b = 10;
        System.out.println("Hello World "+ (a+b));*/

    }
}

class Livro{

    private String nome;
    private Integer npag;

    public Livro(String nome, Integer npag) {
        this.nome = nome;
        this.npag = npag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpag() {
        return npag;
    }

    public void setNpag(Integer npag) {
        this.npag = npag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npag=" + npag +
                '}';
    }
}

