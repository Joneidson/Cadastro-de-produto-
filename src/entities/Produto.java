package entities;

/*
 * ================================================================
 * Arquivo: Produto.java
 * Pacote: entities
 * Autor: Joneidson
 * Data de Criação: 04/08/2025
 *
 * Descrição:
 * TODO: Descreva o propósito deste arquivo.
 *
 * Versão: 1.0
 * ================================================================
 */
public class Produto {

    public String nomeProduto;

    public double precoProduto;

    public int quantidadeProduto; // atributo da class

    public double ValorTotalEstoque() {
        return precoProduto * quantidadeProduto;
    }

    public void adicionarProduto(int quantidadeProduto) {  // <=paramentro do metodo
        this.quantidadeProduto += quantidadeProduto; // para separar parametro de atributo se coloca this.(e o atributo)
    }

    public void RemoveProduto(int quantidadeProduto) { // toda vez que o metodo nao tiver return ele precisar se void (Logo depois de Public)
        this.quantidadeProduto -= quantidadeProduto;
    }

    public String toString() {
        return nomeProduto
                + " , "
                + String.format("%.2f", precoProduto)
                + " , "
                + quantidadeProduto
                + " unidade, Total: R$ "
                + String.format("%.2f", ValorTotalEstoque());
    }

}
