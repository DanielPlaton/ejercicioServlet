package modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento implements Serializable {
	
	@Id
	@Column(name = "codigo")
	int codigo;
	@Column(name = "nombre", nullable = false)
	String nombre;
	@Column(name = "cod_responsable", nullable = false)
	int codResponsable;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodResponsable() {
		return codResponsable;
	}
	public void setCodResponsable(int codResponsable) {
		this.codResponsable = codResponsable;
	}
	public Departamento(int codigo, String nombre, int codResponsable) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.codResponsable = codResponsable;
	}
	public Departamento() {
		super();
	}
	@Override
	public String toString() {
		return "Departamento [codigo=" + codigo + ", nombre=" + nombre + ", codResponsable=" + codResponsable + "]";
	}

	
}
