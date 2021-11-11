package br.com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.br.exception.DBException;
import com.br.ifood.connection.ConnectionManager;

import restaurante.model.Restaurante;

public class OracleRestauranteDAO {

	private Connection conexao;
	
	public void cadastrar(Restaurante restaurante) throws DBException {
		PreparedStatement stmt = null;

		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "INSERT INTO RESTAURANTE VALUES (null,?,?,?,?)";
			
			stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, restaurante.getNomeRestaurante());
			stmt.setString(2, restaurante.getNumeroCnpj());
			stmt.setString(3, restaurante.getDataInauguracao());
			stmt.setString(4, restaurante.getNomeCategoria());

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Erro ao cadastradar.");
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


	public void atualizar(Restaurante restaurante) throws DBException {
			PreparedStatement stmt = null;

			try {
				conexao = ConnectionManager.getInstance().getConnection();
				String sql = "UPDATE TB_PRODUTO SET NM_PRODUTO = ?, QT_PRODUTO = ?, VL_PRODUTO = ?, DT_FABRICACAO = ? WHERE CD_PRODUTO = ?";
				stmt = conexao.prepareStatement(sql);
				stmt.setString(1, restaurante.getNomeRestaurante());
				stmt.setString(2, restaurante.getNumeroCnpj());
				stmt.setString(3, restaurante.getDataInauguracao());
				stmt.setString(4, restaurante.getNomeCategoria());

				stmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DBException("Erro ao atualizar.");
			} finally {
				try {
					stmt.close();
					conexao.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	

	
	public void remover(int codigo) throws DBException {
				PreparedStatement stmt = null;

				try {
					conexao = ConnectionManager.getInstance().getConnection();
					String sql = "DELETE FROM TB_PRODUTO WHERE CD_PRODUTO = ?";
					stmt = conexao.prepareStatement(sql);
					stmt.setInt(1, codigo);
					stmt.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
					throw new DBException("Erro ao remover.");
				} finally {
					try {
						stmt.close();
						conexao.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
			}
	

	
	public Restaurante buscar(int id) {
			PreparedStatement stmt = null;
			ResultSet rs = null;
			Restaurante restaurante = null;
			try {
				conexao = ConnectionManager.getInstance().getConnection();
				stmt = conexao.prepareStatement("SELECT * FROM TB_PRODUTO WHERE CD_PRODUTO = ?");
				stmt.setInt(1, id);
				rs = stmt.executeQuery();

				if (rs.next()){
					int codigo = rs.getInt("CD_PRODUTO");
					String nome = rs.getString("NM_PRODUTO");
					int qtd = rs.getInt("QT_PRODUTO");
					double valor = rs.getDouble("VL_PRODUTO");
					java.sql.Date data = rs.getDate("DT_FABRICACAO");
					
					restaurante = new Restaurante();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					stmt.close();
					rs.close();
					conexao.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return restaurante;
		}
	

	
	public List<Restaurante> listar() {
			List<Restaurante> lista = new ArrayList<Restaurante>();
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conexao = ConnectionManager.getInstance().getConnection();
				stmt = conexao.prepareStatement("SELECT * FROM TB_PRODUTO");
				rs = stmt.executeQuery();

				while (rs.next()) {
					int codigo = rs.getInt("CD_PRODUTO");
					String nome = rs.getString("NM_PRODUTO");
					int qtd = rs.getInt("QT_PRODUTO");
					double valor = rs.getDouble("VL_PRODUTO");
					java.sql.Date data = rs.getDate("DT_FABRICACAO");
					
					Restaurante restaurante = new Restaurante();
					lista.add(restaurante);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					stmt.close();
					rs.close();
					conexao.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return lista;
		}
	}
