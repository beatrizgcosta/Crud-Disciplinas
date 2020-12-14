package com.costa.crud.disciplina.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/mvc_sql_2411?serverTimezone=UTC", "root", "Rosi@85716329");
		} catch (SQLException e) {
			System.out.println("---------------------> " + e.getMessage());
			return null;
		}
	}
}
