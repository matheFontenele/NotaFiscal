package models;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private List<Produto> compras = new ArrayList<>();
    private String nomeCliente;
    private boolean desconto = false;
    private double total;

    public Compra(String nomeCliente, boolean desconto) {
        this.nomeCliente = nomeCliente;
        this.desconto = desconto;
    }

    //Construtores
    public Compra(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    //Getters
    public List<Produto> getCompras() {
        return compras;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public boolean getDesconto() {
        return desconto;
    }
    public double getTotal() {
        return total;
    }

    //Lista de metodos

    //Adicionar produto as compras
    public void adicionarCompra(Produto p){
        compras.add(p);
        System.out.println(p.getNome()+" adicionado ao caixa");
        total = total+p.getPreco();
    }

    //Verificar Desconto por valor (Se o valor da compra passar de 50 cliente tem 10% de desconto)
    public double gerarDescontoporValor(){
        if(total > 50){
            return total = total - (0.1 * total);
        }else {
            return total;
        }
    }


    //Emitir nota fiscal
    public void emitirNota(){
        System.out.println("Suas compras "+getNomeCliente()+ " agradecemos sua preferencia e volte sempre!");
        int i = 1;
        for (Produto p : compras) {
            System.out.println(i+" - " +p.getNome()+" -- "+p.getPreco());
            i=i+1;
        }
        gerarDescontoporValor();
        System.out.println("Total: "+getTotal());
    }
}
