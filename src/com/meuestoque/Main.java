package com.meuestoque;

import com.meuestoque.model.Catalogo;
import com.meuestoque.model.Lote;
import com.meuestoque.model.Produto;
import com.meuestoque.model.Sabor;
import com.meuestoque.repository.ProdutoRepository;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Meu estoque rodando!");

        int opc;
        Scanner scanner = new Scanner(System.in);
        ProdutoRepository prodRepo = new ProdutoRepository();

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1 - Cadastrar novo produto");
            System.out.println("2 - Listar produtos cadastrados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("\n--- [Opção 1] Cadastrar Produto Final ---");

                    System.out.print("Digite o ID do item do Catálogo (ex: 1): ");
                    int idCat = scanner.nextInt();

                    System.out.print("Digite o ID do Sabor (ex: 3): ");
                    int idSab = scanner.nextInt();

                    System.out.print("Digite o ID do Lote (ex: 1): ");
                    int idLot = scanner.nextInt();

                    System.out.print("Digite o Preço de Venda (ex: 15,50): ");
                    BigDecimal preco = scanner.nextBigDecimal();
                    scanner.nextLine();

                    Catalogo catalogoAux = new Catalogo();
                    catalogoAux.setIdCatalogo(idCat);

                    Sabor saborAux = new Sabor();
                    saborAux.setIdSabor(idSab);

                    Lote loteAux = new Lote();
                    loteAux.setIdLote(idLot);

                    Produto novoProduto = new Produto();
                    novoProduto.setCatalogo(catalogoAux);
                    novoProduto.setSabor(saborAux);
                    novoProduto.setLote(loteAux);
                    novoProduto.setPrecoVenda(preco);

                    prodRepo.salvar(novoProduto);
                    break;

                case 2:
                    System.out.println("\nOpção 2 escolhida - (Implementar listarTodos em breve)");
                    break;

                case 0:
                    System.out.println("Saindo do sistema... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opc != 0);

        scanner.close();
    }
}