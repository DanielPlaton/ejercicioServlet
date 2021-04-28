package DAO;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import modelo.Empleado;

public class EmpleadoDAO {

	public static List<Empleado> getAllEmpleados(Session s) {
		String hQuery = "from Empleado";

		List<Empleado> listaEmpleados = s.createQuery(hQuery, Empleado.class).list();
		return listaEmpleados;
	}

	public static List<Empleado> getEmpleadoDeDepartamento(Session s, int departamento) {
		// s.get(Empleado.class, id);
		
		String hQuery = "from Empleado e where e.codDepartamento = :departamento";

		List<Empleado> listaEmpleados =  s.createQuery(hQuery, Empleado.class)
				.setParameter("departamento", departamento)
				.list();

		return listaEmpleados;

	}
/*
	public static List<Empleado> getEmpleadoFecha(Session s, int anio) {
		// s.get(Empleado.class, id);
		
		Calendar cal = new GregorianCalendar();
		int anioActual = cal.get(Calendar.YEAR);
		int mesActual =cal.get(Calendar.MONTH);
		int diaActual =cal.get(Calendar.DAY_OF_MONTH);
		
		anio = anioActual - anio;
		Calendar fechaCalendar = new GregorianCalendar(anioActual, mesActual, diaActual);
		//LocalDateTime  
		Date fechaUtil = (Date) fechaCalendar.getTime();
		//Date fecha = java.sql.Date.valueOf(fechaUtil);
		
		String hQuery = "from Empleado e where e.fechaNacimiento = :fechaNacimiento";

		Criteria criteria = s.createCriteria(Empleado.class);
		//List<Empleado> listaEmpleadosFecha = criteria.add(Restrictions.le("fechaNacimiento", fecha)).list();
		
		return listaEmpleadosFecha;

	}
	*/
	public static void inserEmpleado(Session s, Empleado e) {

		s.save(e);
		
	}
	
	public static void actualizarEmpleado(Session s, int id,String nombre) {
		// s.get(Empleado.class, id);
		
		Empleado e = s.get(Empleado.class, id);
		e.setNombre(nombre);
		s.update(e);
	

	}
	

	public static void borrarEmpleado(Session s, int id) {
		// s.get(Empleado.class, id);
		Empleado e = s.get(Empleado.class, id);

		s.delete(e);

	}


	
}
