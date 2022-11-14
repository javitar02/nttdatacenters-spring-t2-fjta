package com.nttdata.bootcamp.noviembre.persistence;

/**
 * Clase Producto con sus atributos, getters-setters y constructor
 * @author JAVI
 *
 */
public class Producto {
	private int idProd=1;
	private String nomProducto;
	private Double precioPVP;
	private Double precioBase;
	
	public Producto(int idProd,String nomProducto, Double precioBase) {
		super();
		this.nomProducto = nomProducto;
		this.precioBase = precioBase;
	}

	public int getIdProd() {
		return idProd;
	}

	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}


	public String getNomProducto() {
		return nomProducto;
	}

	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}

	public Double getPrecioPVP() {
		return precioPVP;
	}

	public void setPrecioPVP(Double precioPVP) {
		this.precioPVP = precioPVP;
	}

	public Double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(Double precioBase) {
		this.precioBase = precioBase;
	}
	
	@Override
	public String toString() {
		return "Producto [idProd=" + idProd + ", nomProducto=" + nomProducto + ", precioPVP=" + precioPVP
				+ "€, precioBase=" + precioBase + "€]";
	}
}
