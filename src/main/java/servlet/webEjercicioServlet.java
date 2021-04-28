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
import controlador.MyLogger;
import modelo.Departamento;
import utils.HibernateUtil;

/**
 * Servlet implementation class webEjercicioServlet
 */
@WebServlet("/webEjercicioServlet")
public class webEjercicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Transaction tx = null;
	Session session;
	public static Logger logger = MyLogger.crearLogger(webEjercicioServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public webEjercicioServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		logger.info("Iniciando programa");
		session = HibernateUtil.getSessionFactory().openSession();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
logger.info("Procedemos a recoger los departamentos");
		List<Departamento> listaDepartamentos = DepartamentoDAO.getAllDepartamentos(session);
		logger.info("Pintamos la tabla en html recogiendo cada departamento y insertandolo en la tabla");
		response.getWriter().append("<html>");
		response.getWriter().append("<head>");
		response.getWriter().append("<title>ejercicio</title>");
		response.getWriter().append("</head>");
		response.getWriter().append("<body>");
		response.getWriter().append("<table border='solid'>");
		response.getWriter().append("<tr>");
		response.getWriter().append("<th>Codigo</th>");

		response.getWriter().append("<th>Nombre</th>");

		response.getWriter().append(" <th>Codigo Responsable</th>");

		response.getWriter().append("</tr>");
		
		for (int i = 0; i < listaDepartamentos.size(); i++) {

			// response.getWriter().append("Lista de usuarios
			// ").append(listaDepartamentos.get(i).toString());

			response.getWriter().append("<tr>");

			response.getWriter().append(" <td>"+listaDepartamentos.get(i).getCodigo()+"</td>");

			response.getWriter().append("<td>"+listaDepartamentos.get(i).getNombre()+"</td>");

			response.getWriter().append(" <td>"+listaDepartamentos.get(i).getCodResponsable()+"</td>");

			response.getWriter().append(" </tr>");

		
		}
		response.getWriter().append("</table>");

		response.getWriter().append("</body>");
		response.getWriter().append("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

}
