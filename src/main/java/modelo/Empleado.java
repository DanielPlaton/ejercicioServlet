package modelo;

import java.io.Serializable;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado implements Serializable {
	@Id
	@Column(name = "codigo")
	int codigo;
	@Column(name = "nombre",nullable=false)
	String nombre;
	@Column(name = "apellido1",nullable=false)
	String apellido1;
	@Column(name = "apellido2",nullable=false)
	String apellido2;
	@Column(name = "lugar_nacimiento",nullable=false)
	String lugarNacimiento;
	@Column(name = "fecha_nacimiento",nullable=false)
	Date fechaNacimiento;
	@Column(name = "direccion",nullable=false)
	String direccion;
	@Column(name = "telefono",nullable=false)
	String telefono;
	@Column(name = "puesto",nullable=false)
	String puesto;
	@Column(name = "cod_departamento",nullable=false)
	int codDepartamento;
	
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
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getLugarNacimiento() {
		return lugarNacimiento;
	}
	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public int getCodDepartamento() {
		return codDepartamento;
	}
	public void setCodDepartamento(int codDepartamento) {
		this.codDepartamento = codDepartamento;
	}
	public Empleado(int codigo, String nombre, String apellido1, String apellido2, String lugarNacimiento,
			Date fechaNacimiento, String direccion, String telefono, String puesto, int codDepartamento) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.lugarNacimiento = lugarNacimiento;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.puesto = puesto;
		this.codDepartamento = codDepartamento;
	}
	public Empleado() {
		super();
	}
	@Override
	public String toString() {
		return "empleado [codigo=" + codigo + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", lugarNacimiento=" + lugarNacimiento + ", fechaNacimiento=" + fechaNacimiento
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", puesto=" + puesto + ", codDepartamento="
				+ codDepartamento + "]";
	}
	
	
	
	
	
}
