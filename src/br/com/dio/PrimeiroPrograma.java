package br.com.dio;

import model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);
      /* int a = 3;
        int b = 5;
        System.out.println("Hello Word " + (a+b));*/

        Livro livro = new Livro("O poder da Oração", 200);
        System.out.println(livro);


    }
}

 class Livro {

    private String nome;
    private Integer numPaginas;

     public Livro(String nome, Integer numPaginas) {
         this.nome = nome;
         this.numPaginas = numPaginas;
     }

     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public Integer getNumPaginas() {
         return numPaginas;
     }

     public void setNumPaginas(Integer numPaginas) {
         this.numPaginas = numPaginas;
     }

     @Override
     public String toString() {
         return "Livro{" +
                 "nome=" + nome +
                 ", numPaginas=" + numPaginas +
                 '}';
     }
 }

