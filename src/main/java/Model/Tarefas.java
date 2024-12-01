/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Guerra
 */
public class Tarefas {

    private String nome;  // Nome do serviço
    private double preco; // Preço do serviço

   public Tarefas(){
       
   }
    public Tarefas(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para exibir os detalhes do serviço
    public void exibirDetalhes() {
        System.out.println("Serviço: " + nome);
        System.out.println("Preço: R$" + preco);
    }
}
