package com.dataobjectaccess.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import com.connection.control.Conexion;
import com.modelo.model.Empleado;
import com.mysql.cj.api.jdbc.Statement;

public class TestDao {
	private Conexion con;
	public TestDao(String jdbcURL, String jdbcUserName, String jdbcPassword) throws SQLException {
		con = new Conexion(jdbcURL, jdbcUserName, jdbcPassword);
		//con.connection();
		
	}

	
	
	public boolean registrar(Empleado e) throws ParseException{
		boolean estado=false;
		Statement stm;
		
		
	 
	     
		
		String sql="INSERT INTO empleado VALUES('"+e.getCodigo()+"','"+e.getCedula()+"','"+e.getNombre()+"','"+e.getFecha_nacimiento()+"','"+e.getFecha_ingreso()+"','"+e.getFecha_retiro()+"')";
		System.out.print(sql);
		try {
			con.connection();
			estado=true;
			stm=  (Statement) con.getJdbcConnection().createStatement();
			stm.executeUpdate(sql);
			stm.close();
			con.discconect();
			
		} catch (SQLException e1) {
			estado=false;
			e1.printStackTrace();
		}
		
		return estado;
	}
	
	public ResultSet buscar (String codigo) {
		ResultSet nombre=null;
		boolean encontrado=false;
		Statement stm;
	
		
		String sql="SELECT nombre FROM empleado WHERE codigo ='"+codigo+"'";
		try {
			con.connection();
			
			stm=  (Statement) con.getJdbcConnection().createStatement();
			nombre = stm.executeQuery(sql);
			stm.close();
			con.discconect();
			encontrado=true;
			
		} catch (SQLException e1) {
			encontrado=false;
			e1.printStackTrace();
		}
		return nombre;
	}
}
