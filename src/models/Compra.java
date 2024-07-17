package models;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private List<Produto> compras;
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
        this.compras = new ArrayList<>();
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
    public void adicionarCompra(String produto, double valor){
        compras.add(new Produto(produto, valor));
        System.out.println(produto+" adicionado ao caixa");
        total = total+valor;
    }

    //Verificar Desconto por valor (Se o valor da compra passar de 50 cliente tem 10% de desconto)
    public double gerarDescontoporValor(){
        if(total > 50){
            System.out.println("Aplicando 10%");
            return total = total - (0.1 * total);
        }else {
            System.out.println("Desconto não aplicado");
            return total;
        }
    }

    //Verificar se cliente é do plano plus (Se sim, ganha mais 10% de desconto)
    public double gerarDescontoPorPlano(boolean plano){
        if(plano){
            System.out.println("Usuario é plus");
            return total = total - (0.1 * total);
        }else {
            System.out.println("Usuario não é plus");
            return total;
        }
    }


    //Emitir nota fiscal
    public void emitirNota(Cliente c){
        System.out.println("Suas compras "+getNomeCliente()+ " agradecemos sua preferencia e volte sempre!");
        int i = 1;
        for (Produto p : compras) {
            System.out.println(i+" - " +p.getNome()+" -- "+p.getPreco());
            i=i+1;
        }
        gerarDescontoporValor();
        gerarDescontoPorPlano(c.getPlanoPlus());
        System.out.println("Total: "+getTotal());
    }
}
