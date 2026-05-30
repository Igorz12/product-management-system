package service;

import model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    private List<Produto> produtos =  new ArrayList<>();


    // ==== SETTERS ====

    //Adicionar Produtos
    public void adicionarProdutos(Produto produto){
        produtos.add(produto);
    }

    //Listar Produtos
    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println( "ID:" +
            produto.getId() + " - " + produto.getNome() + " - R$" + produto.getPreco()
            );
        }
    }

    //Remover produto
    public void removerProdutos(Produto produto){
        produtos.remove(produto);
    }

    public void atualizarPreco(Long id, double preco){
        Produto produtoEncontrado = buscarProdutoPorID(id);

        if (produtoEncontrado != null){
            produtoEncontrado.setPreco(preco);
        }else {
            System.out.println("Produto não encontrado.");
        }
    }
    //Buscar por ID
    public Produto buscarProdutoPorID(Long id){
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)){
                return produto;
            }
        }
        return null;
    }
}

