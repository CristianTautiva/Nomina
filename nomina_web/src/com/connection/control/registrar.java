package com.connection.control;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dataobjectaccess.dao.TestDao;
import com.modelo.model.Empleado;

/**
 * Servlet implementation class registrar
 */
@WebServlet("/registrar")
public class registrar extends HttpServlet {
	TestDao test;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registrar() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	 String jdbcURL = getServletContext().getInitParameter("jdbcURL");
    	 String jdbcUserName = getServletContext().getInitParameter("jdbcUserName");
    	 String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
    	 System.out.print(jdbcURL);
    	 
    	 try {
			test = new TestDao(jdbcURL, jdbcUserName, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("registrar.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
		Empleado empleado = new Empleado(request.getParameter("codigo"), request.getParameter("cedula"), request.getParameter("nombre"), request.getParameter("fecha_de_nacimiento"),request.getParameter("fecha_de_ingreso"),request.getParameter("fecha_de_retiro"));
		try {
			if(test.registrar(empleado)) {
				System.out.print("Se registro el empleado correctamente");
			}else {
				System.out.print("Ocurrio un error inesperado");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("index.jsp");

}
}
