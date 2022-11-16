package ec3.pablo.burga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ec3.pablo.burga.model.UsuarioCliente;

@Repository
public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Integer>{

	UsuarioCliente findByUsuario(String usuario);
	
}
