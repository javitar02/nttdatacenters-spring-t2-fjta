package com.nttdata.bootcamp.noviembre.services;

import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.noviembre.persistence.Pedido;

/**
 * Interfaz donde se declaran los métodos que se piden para implementar el servicio
 * @author JAVI
 *
 */
@Service
public interface ServicioPedidoI {
	public void calcularPVP(Pedido pedido) throws Exception;
	public Pedido crearPedido(String destinatario, String dirEntrega, boolean melillaCeutaCanarias) throws Exception;
	public void annadirProducto(Pedido pedido,String nomProducto, Double precioBase);
}
