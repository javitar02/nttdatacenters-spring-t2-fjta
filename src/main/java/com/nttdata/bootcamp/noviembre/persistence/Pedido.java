package com.nttdata.bootcamp.noviembre.persistence;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase Pedido con sus atributos, getters-setters y constructor
 * @author JAVI
 *
 */
public class Pedido {
	List<Producto>listaProductos;
	private int idPedido;
	private String destinatario;
	private String dirEntrega;
	private boolean melillaCeutaCanarias;
	
	public Pedido(int idPedido,String destinatario, String dirEntrega, boolean melillaCeutaCanarias) {
		super();
		this.idPedido=1;
		this.listaProductos = new ArrayList<>();
		this.destinatario = destinatario;
		this.dirEntrega = dirEntrega;
		this.melillaCeutaCanarias = false;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getDirEntrega() {
		return dirEntrega;
	}

	public void setDirEntrega(String dirEntrega) {
		this.dirEntrega = dirEntrega;
	}

	public boolean getMelillaCeutaCanarias() {
		return melillaCeutaCanarias;
	}

	public void setMelillaCeutaCanarias(boolean melillaCeutaCanarias) {
		this.melillaCeutaCanarias = melillaCeutaCanarias;
	}

	@Override
	public String toString() {
		if(this.melillaCeutaCanarias) {
			return "IdPedido: "+idPedido+"\nDestinatario "+destinatario+"\nDireccion entrega: "+dirEntrega+
					"\nDestinado a Melilla/Ceuta/Canarias "
					+ "\nListaProductos: "+this.listaProductos;
		}else {
			return "IdPedido: "+idPedido+"\nDestinatario "+destinatario+"\nDireccion entrega: "+dirEntrega+
					"\nDestinado a la Península"
					+ "\nListaProductos: "+this.listaProductos;
		}
		
	}
	
	
}
