package co.edu.usbcali.viajes.app.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_identificacion")
public class TipoIdentificacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1373757505648968197L;
    
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tiid" , nullable = false , unique = true)
	private Integer idTiid;
	
	@Column(name = "codigo" , nullable = false, unique = true)
	private String codigo;
	
	@Column(name = "nombre" , nullable = false)
	private String nombre;
	
	@Column(name = "fecha_creacion" , nullable = false)
	private Date fechaCreacion;
	
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	
	@Column(name = "usu_creador" , nullable = false)
	private String usuCreador;
	
	@Column(name = "usu_modificador")
	private String usuModificador;
	
	@Column(name = "estado" , nullable = false)
	private String estado;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "tiId")
	private List<Cliente> cliente = new ArrayList<>();
	
	
	//Constructor
	public TipoIdentificacion() {
		super();
	}

	
	//Constructor sobrecargado
	public TipoIdentificacion(Integer idTiid, String codigo, String nombre, Date fechaCreacion, Date fechaModificacion,
			String usuCreador, String usuModificador, String estado) {
		super();
		this.idTiid = idTiid;
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.usuCreador = usuCreador;
		this.usuModificador = usuModificador;
		this.estado = estado;
	}

    
	//Getters and setters
	public Integer getIdTiid() {
		return idTiid;
	}


	public void setIdTiid(Integer idTiid) {
		this.idTiid = idTiid;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Date getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public Date getFechaModificacion() {
		return fechaModificacion;
	}


	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}


	public String getUsuCreador() {
		return usuCreador;
	}


	public void setUsuCreador(String usuCreador) {
		this.usuCreador = usuCreador;
	}


	public String getUsuModificador() {
		return usuModificador;
	}


	public void setUsuModificador(String usuModificador) {
		this.usuModificador = usuModificador;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
}
