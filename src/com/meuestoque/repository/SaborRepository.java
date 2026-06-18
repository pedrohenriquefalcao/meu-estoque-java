package com.meuestoque.repository;

import com.meuestoque.model.Sabor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SaborRepository {

    public void salvar(Sabor sabor) {
        String sql = "INSERT INTO sabor (nome_sabor) VALUES (?)";

        try (Connection conn = ConexaoDatabase.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, sabor.getNomeSabor());
            stmt.executeUpdate();

            System.out.println("Sabor '"+sabor.getNomeSabor()+"' inserido com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao salvar sabor!");
            e.printStackTrace();
        }
    }

public List<Sabor> listarTodos() {
        String sql = "SELECT * FROM sabor";

        List<Sabor> sabores = new ArrayList<>();

        try (Connection conn = ConexaoDatabase.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Sabor sabor = new Sabor();

                sabor.setIdSabor(rs.getInt("id_sabor"));

                sabor.setNomeSabor(rs.getString("nome_sabor"));

                sabores.add(sabor);

            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar sabores!!");
            e.printStackTrace();
        }

        return sabores;
}





}
