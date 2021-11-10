package com.br.ifood;

import java.util.LinkedList;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;


/* PARA CONECTAR COM O BANCO*/

public class RestauranteDAO {
	
	public Connection connection;
	
	//consultor
	public void DAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection GetConnection() {
		OpenConnection();
		System.out.println("Conectou");
		return this.connection;
	}
	
	//responsável por abrir a conexao
	private void OpenConnection() {
		try {
			this.connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM88315", "020693");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//fechar a conexão
	private void CloseConnection() {
		try {
			if (this.connection != null){
				this.connection.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int ExecuteCommand(PreparedStatement stmt) {
		int j = 0;
		try {
			j = stmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			CloseConnection();
		}
		return j;
	}
	
	public ResultSet GetData(PreparedStatement stmt) {
		ResultSet resultSet = null;
		try {
			resultSet = stmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			CloseConnection();
		}
		return resultSet;
	}


}
