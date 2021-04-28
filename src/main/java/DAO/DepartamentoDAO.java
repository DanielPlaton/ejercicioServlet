package DAO;

import java.util.List;

import org.hibernate.Session;

import modelo.Departamento;


public class DepartamentoDAO {
	
	public static List<Departamento> getAllDepartamentos(Session s) {
		String hQuery = "from Departamento";

		List<Departamento> listaDepartamentos = s.createQuery(hQuery, Departamento.class).list();
		return listaDepartamentos;
	}
	
	public static void inserDepartamento(Session s, Departamento d) {

		s.save(d);
		
	}
	
	public static void borrarDepartamento(Session s, int id) {
		// s.get(Empleado.class, id);
		Departamento d = s.get(Departamento.class, id);

		s.delete(d);

	}
}
