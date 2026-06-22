package service;

import exception.IdInvalidoException;
import exception.PrecoInvalidoException;
import exception.ProdutoNaoEncontradoException;
import model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    private List<Produto> produtos =  new ArrayList<>();
    
    // ==== SETTERS ====

    //Adicionar Produtos
    public void adicionarProdutos(Produto produto){
        if (produto.getId() <= 0) {
            throw new IdInvalidoException("ID deve ser maior que zero. " );
        }

        if (produto.getPreco() <= 0) {
            throw new PrecoInvalidoException("Preço não pode ser negativo.");
        }

        if (produto.getQuantidadesEstoque() < 0) {
            throw new ProdutoNaoEncontradoException(
                    "Quantidade em estoque não pode ser negativa.");
        }

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

    //Atualizar preço
    public void atualizarPreco(Long id, double preco){

        Produto produtoEncontrado = buscarProdutoPorID(id);
        if (preco < 0) {
            throw new PrecoInvalidoException("Preço não pode ser negativo.");
        }
        produtoEncontrado.setPreco(preco);
    }
    //Buscar por ID
    public Produto buscarProdutoPorID(Long id){
        //Se for menor que zero:
        if (id <= 0 ) {
            throw new IdInvalidoException("ID deve ser maior que zero. " );
        }

        //Manipulação do produto
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)){
                return produto;
            }
        }
        //Exception se o id não for correto
        throw new ProdutoNaoEncontradoException("Produto de ID: " + id + " Não encontrado. ");
    }
}

