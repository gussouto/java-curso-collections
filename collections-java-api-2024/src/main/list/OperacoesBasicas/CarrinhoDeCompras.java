package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
              if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
              }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                valorTotal = i.getPreco() * i.getQuantidade();
                valorTotal += valorTotal; 
            }   
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");           
        }
    }


    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
    
        // Adicionando itens ao carrinho 
        carrinhoDeCompras.adicionarItem("Lápis", 1d, 5);
        carrinhoDeCompras.adicionarItem("Lápis", 1d, 5);
        carrinhoDeCompras.adicionarItem("Caderno", 10d, 3);
        carrinhoDeCompras.adicionarItem("Borracha", 3d, 5);
    
        // Exibindo itens do carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo ites do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        //Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }

    
}
