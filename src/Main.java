import model.Produto;
import service.ProdutoService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProdutoService service = new ProdutoService();

        // Adicionando produto
        Produto p1 = new Produto(1L, "Teclado Mecânico", 250.0, 10);
        service.adicionarProdutos(p1);

        // Listando
        service.listarProdutos();
    }
}