package com.onboarding.models;

import java.sql.Date;

public class Post {
	private int id;
	private String descripcion;
	private String urlImg;
	private Date fecha;
	private String Titulo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUrlImg() {
		return urlImg;
	}
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public Post(int id, String descripcion, String urlImg, Date fecha, String titulo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.urlImg = urlImg;
		this.fecha = fecha;
		Titulo = titulo;
	}
	
	public Post() {
		
	}
		
	
}
