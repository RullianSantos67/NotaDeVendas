package model;

import java.util.ArrayList;
import java.util.List;

public class Vendas {
    private Produtos produto;
    private int quantidade;
    private List<Vendas> vendas = new ArrayList<>();

    public Vendas(Produtos produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }


    public Produtos getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }


    public double calcularTotalVenda() {
        return produto.getPreco() * quantidade;

    }
    public double totalVendas() {
        double total = 0;
        for (Vendas venda : vendas) {
            total += venda.getProduto().getPreco() * venda.getQuantidade();
        }
        return total;
    }

    public void adicionarVenda(Produtos produto,int quantidade) {
        vendas.add(new Vendas(produto,quantidade));
    }

    public void exibirVendas() {
        System.out.println("Vendas realizadas:");
        for (Vendas venda : vendas) {
            System.out.println("Produto: " + venda.getProduto().getNome() +
                    ", Quantidade: " + venda.getQuantidade() +
                    ", Preço Unitário: " + venda.getProduto().getPreco() +
                    ", Total: " + venda.calcularTotalVenda());

            System.out.println("Total da venda: " + totalVendas());

        }
    }
}

