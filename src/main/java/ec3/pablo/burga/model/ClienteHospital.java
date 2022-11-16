package ec3.pablo.burga.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente_hospital")
public class ClienteHospital {
	
	@Id
	private ClienteHospital fk = new ClienteHospital();

}

@Embeddable
class ClienteProductoFk implements Serializable{
	
	private static final long serialVersionUID = 668727937556427463L;
	
	@Column(name = "id_cliente", nullable = false, unique = true)
	private Integer idCliente;
	
	@Column(name = "id_hospital", nullable = false, unique = true)
	private Integer idHospital;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdProducto() {
		return idHospital;
	}

	public void setIdProducto(Integer idProducto) {
		this.idHospital = idProducto;
	}	
}
