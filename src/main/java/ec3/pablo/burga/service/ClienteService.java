package ec3.pablo.burga.service;

import java.util.List;
import ec3.pablo.burga.model.Cliente;

public interface ClienteService {
	
	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);
	List<Cliente> listar();
	Cliente obtener(Integer id);

}
