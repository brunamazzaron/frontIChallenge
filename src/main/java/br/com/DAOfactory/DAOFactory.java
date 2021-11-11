package br.com.DAOfactory;

import br.com.dao.impl.OracleRestauranteDAO;
import restaurante.DAO.RestauranteDAO;

public class DAOFactory {

	public static RestauranteDAO getProdutoDAO() {
		return (RestauranteDAO) new OracleRestauranteDAO();
	}
	
}