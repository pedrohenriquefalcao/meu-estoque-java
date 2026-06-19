package com.meuestoque.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDatabase {

    private static final String URL = System.getenv("DB_URL");
    private static final String USUARIO = System.getenv("DB_USER") != null ? System.getenv("DB_USER") : "postgres";
    private static final String SENHA = System.getenv("DB_PASSWORD");


    public static Connection conectar() {
        try {
            Class.forName("org.postgresql.Driver");

            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException e) {
            System.err.println("Erro: Driver JDBC do PostgreSQL não foi encontrado!");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            System.err.println("Erro: Falha na conexão com o banco! Verifique as suas credenciais.");
            e.printStackTrace();
            return null;
        }
    }

}
