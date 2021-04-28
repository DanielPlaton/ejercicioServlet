package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import DAO.DepartamentoDAO;
import DAO.EmpleadoDAO;
import controlador.MyLogger;
import modelo.Departamento;
import modelo.Empleado;
import utils.HibernateUtil;

/**
 * Servlet implementation class webServletMostrarEmpleados
 */
@WebServlet("/webServletMostrarEmpleados")
public class webServletMostrarEmpleados extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Transaction tx = null;
	Session session;
	public static Logger logger = MyLogger.crearLogger(webServletMostrarEmpleados.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public webServletMostrarEmpleados() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		logger.info("Iniciando programa");
		session = HibernateUtil.getSessionFactory().openSession();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		List<Empleado> listaEmpleados = EmpleadoDAO.getAllEmpleados(session);
//		response.getWriter().append("<html>");
//		response.getWriter().append("<head>");
//		response.getWriter().append("<title>Web Mostrar Empleados</title>");
//		response.getWriter().append("</head>");
//		response.getWriter().append("<body>");
//		response.getWriter().append("<table border='solid'>");
//		
//		response.getWriter().append("<tr>");
//		response.getWriter().append("<th>Codigo</th>");
//		response.getWriter().append("<th>Nombre</th>");
//		response.getWriter().append(" <th>Primer Apellido</th>");
//		response.getWriter().append(" <th>Segundo Apellido</th>");
//		response.getWriter().append(" <th>Lugar Nacimiento</th>");
//		response.getWriter().append(" <th>Fecha Nacimiento</th>");
//		response.getWriter().append(" <th>Dirección</th>");
//		response.getWriter().append(" <th>Telefono</th>");
//		response.getWriter().append(" <th>Puesto</th>");
//		response.getWriter().append(" <th>Codigo Departamento</th>");
//
//		response.getWriter().append("</tr>");
		
		for (int i = 0; i < listaEmpleados.size(); i++) {

			response.getWriter().append("Lista de usuarios").append(listaEmpleados.get(i).toString());
/*
			response.getWriter().append("<tr>");

			response.getWriter().append(" <td>"+listaEmpleados.get(i).getCodigo()+"</td>");

			response.getWriter().append("<td>"+listaEmpleados.get(i).getNombre()+"</td>");

			response.getWriter().append(" <td>"+listaEmpleados.get(i).getApellido1()+"</td>");
			response.getWriter().append(" <td>"+listaEmpleados.get(i).getApellido2()+"</td>");
			response.getWriter().append(" <td>"+listaEmpleados.get(i).getLugarNacimiento()+"</td>");
			String fecha = listaEmpleados.get(i).getFechaNacimiento().toString();
			response.getWriter().append(" <td>"+fecha+"</td>");
			response.getWriter().append(" <td>"+listaEmpleados.get(i).getDireccion()+"</td>");
			response.getWriter().append(" <td>"+listaEmpleados.get(i).getTelefono()+"</td>");
			response.getWriter().append(" <td>"+listaEmpleados.get(i).getPuesto()+"</td>");
			response.getWriter().append(" <td>"+listaEmpleados.get(i).getCodDepartamento()+"</td>");
			response.getWriter().append(" </tr>");

	*/
		}
//		response.getWriter().append("</table>");
//
//		response.getWriter().append("</body>");
//		response.getWriter().append("</html>");
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
