package model;

public class Produto {
    //Atributos
    private Long id;
    private String nome;
    private double preco;
    private int quantidadesEstoque;


    //Construtores
    public Produto(Long id, String nome, double preco, int quantidadesEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadesEstoque = quantidadesEstoque;
    }

    // ==== GETTERS ====

    //Get ID
    public Long getId() {
        return id;
    }

    //Get Nome
    public String getNome() {
        return nome;
    }

    //Get Preço
    public double getPreco() {
        return preco;
    }

    //Get Quantidade de estoque
    public int getQuantidadesEstoque() {
        return quantidadesEstoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
