import models.Cliente;
import models.Compra;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Jose", false);

        Compra novaCompra = new Compra(cliente1.getNome());
        novaCompra.adicionarCompra("Ketchup", 20.0);
        novaCompra.adicionarCompra("Arroz", 5.80);
        novaCompra.adicionarCompra("Frango", 5.30);
        novaCompra.adicionarCompra("Queijo", 2.60);

        novaCompra.emitirNota(cliente1);
    }
}