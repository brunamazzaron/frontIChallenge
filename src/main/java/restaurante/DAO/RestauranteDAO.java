package restaurante.DAO;

import java.sql.PreparedStatement;
import restaurante.model.Restaurante;
import java.sql.Connection;
import java.util.List;
import com.br.exception.DBException;


public interface RestauranteDAO {
		
		void cadastrar(Restaurante restaurante) throws DBException;
		void atualizar(Restaurante restaurante) throws DBException;
		void remover(int codigo) throws DBException;
		Restaurante buscar(int id);
		List<Restaurante> listar();
	}
	