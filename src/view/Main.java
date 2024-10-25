package view;

import model.Produtos;
import model.Vendas;

public class Main {
    public static void main(String[] args) {

                Vendas venda = new Vendas(null,0);

                Produtos produto1 = new Produtos("Arroz", 12.00);
                Produtos produto2 = new Produtos("Feijão", 15.00);
                Produtos produto3 = new Produtos("Café", 7.50);


                venda.adicionarVenda(produto1,2);
                venda.adicionarVenda(produto2,5);
                venda.adicionarVenda(produto3,6);

                venda.exibirVendas();
            }
        }

