package com.nttdata.bootcamp.noviembre.services;

import org.springframework.stereotype.Service;
import com.nttdata.bootcamp.noviembre.persistence.Pedido;
import com.nttdata.bootcamp.noviembre.persistence.Producto;

/**
 * Servicio para implementar las distintas funciones
 * @author JAVI
 *
 */
@Service
public class ServicioPedidoImpl implements ServicioPedidoI {
	/**
	 * Método calcularPvp donde se recorre la lista de productos
	 * Y según a dónde vaya el pedido, se le calcula su PVP
	 * Mostrando un mensaje con el resultado al final del método
	 * @param pedido Pedido que se ha realizado
	 */
	@Override
	public void calcularPVP(Pedido pedido) throws Exception {
		Double precioPVP=0.0;
		Double precioTotal=0.0;
		
		for (Producto producto : pedido.getListaProductos()) {
			if(pedido.getMelillaCeutaCanarias()) {
				precioPVP=producto.getPrecioBase()*1.04;
			}else {
				precioPVP=producto.getPrecioBase()*1.21;
			}
			producto.setPrecioPVP(precioPVP);
			precioTotal+=precioPVP;
			
		}
		System.out.println("El importe total del pedido es de "+Math.round(precioTotal*100.00)/100.00+"€");
		
	}

	/**
	 * Método para crear un pedido
	 * @param destinatario Del pedido
	 * @param dirEntrega dirección de entrega del pedido
	 * @param melillaCeutaCanarias Booleano que indica si el pedido va a esa zona
	 * (true) o a la Península (false)
	 * @return Nuevo objeto pedido creado
	 */
	@Override
	public Pedido crearPedido(String destinatario, String dirEntrega, boolean melillaCeutaCanarias) throws Exception {
		int idPedido=+1;
		return new Pedido(idPedido,destinatario, dirEntrega, melillaCeutaCanarias);
	}

	/**
	 * Método para añadir un producto a la lista de productos del envío
	 * @param pedido Objeto pedido que se ha realizado
	 * @param nomProducto Nombre del producto a crear
	 * @param precioBase Precio Base del producto a crear. Es un double
	 */
	@Override
	public void annadirProducto(Pedido pedido,String nomProducto, Double precioBase) {
		int idProducto=0;
		pedido.getListaProductos().add(new Producto(idProducto+1,nomProducto, precioBase));

	}
	

}
