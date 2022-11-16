package ec3.pablo.burga.service;

import java.util.List;
import ec3.pablo.burga.model.UsuarioCliente;

public interface UsuarioClienteService {
	
	void guardar(UsuarioCliente usuariocliente);
	void actualizar(UsuarioCliente usuariocliente);
	void eliminar(Integer id);
	List<UsuarioCliente> listar();
	UsuarioCliente obtener(Integer id);

}
