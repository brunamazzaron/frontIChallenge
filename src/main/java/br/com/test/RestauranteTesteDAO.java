package br.com.test;

import java.util.List;

import com.br.exception.DBException;

import br.com.DAOfactory.DAOFactory;
import restaurante.DAO.RestauranteDAO;
import restaurante.model.Restaurante;

public class RestauranteTesteDAO {

	public static void main(String[] args) {
		RestauranteDAO dao = DAOFactory.getProdutoDAO();
		
		Restaurante restaurante = new Restaurante();
		try {
			dao.cadastrar(restaurante);
			System.out.println("Restaurante cadastrado.");
		} catch (DBException e) {
			e.printStackTrace();
		}

		restaurante = dao.buscar(1);
		restaurante.setNomeRestaurante("Restaurante Top");
		restaurante.setNumeroCnpj("sasas");
		try {
			dao.atualizar(restaurante);
			System.out.println("Restaurante atualizado.");
		} catch (DBException e) {
			e.printStackTrace();
		}
		
		List<Restaurante> lista = dao.listar();
		for (Restaurante item : lista) {
			System.out.println(item.getNomeRestaurante() + " " + item.getNumeroCnpj() + " " );
		}
		
		try {
			dao.remover(1);
			System.out.println("restaurante removido.");
		} catch (DBException e) {
			e.printStackTrace();
		}	
	}	
}