package com.connection.control;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dataobjectaccess.dao.TestDao;

/**
 * Servlet implementation class buscar
 */
@WebServlet("/buscar")
public class buscar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       TestDao test;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buscar() {
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
		// TODO Auto-generated method stub
		response.sendRedirect("buscar.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ResultSet valor = test.buscar(request.getParameter("codigo"));
		System.out.print(valor);
		response.getWriter().append("<br> " + valor);
	}

}
