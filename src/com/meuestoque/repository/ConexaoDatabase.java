package com.meuestoque.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDatabase {

    private static final String URL = "jdbc:postgresql://localhost:5432/estoqueDeProdutos";
    private static final String USUARIO = System.getenv("DB_USER") != null ? System.getenv("DB_USER") : "postgres";
    private static final String SENHA = System.getenv("DB_PASSWORD");


}
