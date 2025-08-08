package application;

import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

/*
 * ================================================================
 * Arquivo: main2.java
 * Pacote: application
 * Autor: Joneidson
 * Data de Criação: 04/08/2025
 *
 * Descrição:
 * TODO: Descreva o propósito deste arquivo.
 *
 * Versão: 1.0
 * ================================================================
 */
public class Main2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String contador = "S";
        Produto produto = new Produto();

        while (contador.equalsIgnoreCase("S")) {
            System.out.println("==========================");
            System.out.println("           Menu");
            System.out.println("==========================");
            System.out.println("     Escolha uma Opção");
            System.out.println("1 - Cadastro de produto");
            System.out.println("2 - Consulta estoque");
            System.out.println("3 - Adicionar produto em estoque");
            System.out.println("4 - Remover produto do estoque");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1: {
                    produto = new Produto();
                    System.out.println("Qual o nome do produto?");
                    produto.nomeProduto = sc.nextLine();

                    System.out.println("Qual o preço do produto?");
                    produto.precoProduto = sc.nextDouble();

                    System.out.println("Quantidade que vai entrar no estoque?");
                    produto.quantidadeProduto = sc.nextInt();
                    sc.nextLine();

                    System.out.println("O Produto inserido foi: " + produto.nomeProduto + " , " + produto.precoProduto + " , " + produto.quantidadeProduto);
                    break;
                }

                case 2: {
                    if (produto != null) {
                        System.out.println("O valor total em estoque é de R$: " + produto.ValorTotalEstoque());
                        System.out.println("Produtos: " + produto.nomeProduto + " , " + produto.quantidadeProduto);
                    } else {
                        System.out.println("Nenhum produto cadastrado");
                    }
                    break;
                }

                case 3: {
                    System.out.println("Material em estoque: " + produto.nomeProduto + ", " + produto.quantidadeProduto);
                    System.out.println("Quantidade de produto que deseja adicionar: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();
                    produto.adicionarProduto(quantidade);
                    System.out.println("Quantidade Atualizada: ");
                    System.out.println(produto.quantidadeProduto);
                    break;
                }
                case 4: {
                    System.out.println("Material em estoque: " + produto.nomeProduto + ", " + produto.quantidadeProduto);
                    System.out.println("Quanto você gostaria de remover: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();
                    produto.RemoveProduto(quantidade);
                    System.out.println("Quantidade atualizada");
                    System.out.println(produto.quantidadeProduto);
                    break;
                }

                default:
                    System.out.println("Opção invalida");
            }


            System.out.println("Gostaria de fazer outra operaçâo ? (S/N)");
            contador = sc.nextLine();

        }
        System.out.println("===================================");
        System.out.println("Obrigado por usar nossos serviços!!");
        System.out.println("===================================");


        sc.close();
    }
}

