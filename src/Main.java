import models.Cliente;
import models.Compra;
import models.Produto;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Jose", false);

        Produto produto1 = new Produto("Ketchup", 20.0);
        Produto produto2 = new Produto("Arroz", 5.80);
        Produto produto3 = new Produto("Feijão", 4.20);
        Produto produto4 = new Produto("Frango", 5.30);
        Produto produto5 = new Produto("Queijo", 2.60);

        Compra novaCompra = new Compra(cliente1.getNome());
        novaCompra.adicionarCompra(produto1);
        novaCompra.adicionarCompra(produto1);
        novaCompra.adicionarCompra(produto1);
        novaCompra.adicionarCompra(produto1);

        novaCompra.emitirNota(cliente1);
    }
}