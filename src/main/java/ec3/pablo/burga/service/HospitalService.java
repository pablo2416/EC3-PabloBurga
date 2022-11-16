package ec3.pablo.burga.service;

import java.util.List;
import ec3.pablo.burga.model.Hospital;

public interface HospitalService {

	void guardar(Hospital hospital);
	void actualizar(Hospital hospital);
	void eliminar(Integer id);
	List<Hospital> listar();
	Hospital obtener(Integer id);
}
