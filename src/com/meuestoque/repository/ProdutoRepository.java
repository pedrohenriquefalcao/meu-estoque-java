package com.meuestoque.repository;

import com.meuestoque.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoRepository {

    public void salvar(Produto produto) {
        String sql = "INSERT INTO produto (id_catalogo, id_sabor, id_lote, preco_venda) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexaoDatabase.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, produto.getCatalogo().getIdCatalogo());
            stmt.setInt(2, produto.getSabor().getIdSabor());
            stmt.setInt(3, produto.getLote().getIdLote());
            stmt.setBigDecimal(4, produto.getPrecoVenda());

            stmt.executeUpdate();
            System.out.println("Sucesso!! Novo produto montado e pronto para venda.");

        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar o produto no estoque!");
            e.printStackTrace();
        }
    }
}