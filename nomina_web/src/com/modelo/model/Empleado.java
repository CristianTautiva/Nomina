package com.modelo.model;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.GregorianCalendar;

public class Empleado {
	private String codigo;
	private String cedula;
	private String nombre;
	private String fecha_nacimiento;
	private String fecha_ingreso;
	private String fecha_retiro;
	
	public Empleado(String codigo, String cedula, String nombre, String fecha_nacimiento,String fecha_ingreso, String fecha_retiro) {
		this.codigo=codigo;
		this.cedula=cedula;
		this.nombre=nombre;
		this.fecha_nacimiento=fecha_nacimiento;
		this.fecha_ingreso=fecha_ingreso;
		this.fecha_retiro=fecha_retiro;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}



	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}



	public String getFecha_ingreso() {
		return fecha_ingreso;
	}



	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}



	public String getFecha_retiro() {
		return fecha_retiro;
	}



	public void setFecha_retiro(String fecha_retiro) {
		this.fecha_retiro = fecha_retiro;
	}



	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", cedula=" + cedula + ", fecha_nacimiento=" + fecha_nacimiento
				+ ", fecha_ingreso=" + fecha_ingreso + ", fecha_retiro=" + fecha_retiro + "]";
	}
	

}
