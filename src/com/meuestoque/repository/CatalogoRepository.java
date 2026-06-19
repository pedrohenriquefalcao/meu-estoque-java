package com.meuestoque.repository;

import com.meuestoque.model.Catalogo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CatalogoRepository {

    public void salvar(Catalogo catalogo) {
        String sql = "INSERT INTO catalogo (nome_produto, descricao, preco_base) VALUES (?, ?, ?)";

        try (Connection conn = ConexaoDatabase.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, catalogo.getNomeProduto());
            stmt.setString(2, catalogo.getDescricao());
            stmt.setBigDecimal(3, catalogo.getPrecoBase());

            stmt.executeUpdate();

            System.out.println("Sucesso!! '" + catalogo.getNomeProduto() + "' foi adicionado ao catálogo.");

        } catch (SQLException e) {
            System.err.println("Erro ao salvar produto no catálogo!");
            e.printStackTrace();
        }
    }
}