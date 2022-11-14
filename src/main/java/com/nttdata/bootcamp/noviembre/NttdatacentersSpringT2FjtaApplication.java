package com.nttdata.bootcamp.noviembre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nttdata.bootcamp.noviembre.persistence.Pedido;
import com.nttdata.bootcamp.noviembre.services.ServicioPedidoI;

/**
 * Clase Main donde se prueban las funcionalidades del proyecto
 * Se instancian los objetos pertinentes junto a un objeto de la interfaz creada para el servicio
 * Se llevan a cabo las pruebas
 * @author JAVI
 *
 */
@SpringBootApplication
public class NttdatacentersSpringT2FjtaApplication implements CommandLineRunner{
	@Autowired
	ServicioPedidoI servicioPedido;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(NttdatacentersSpringT2FjtaApplication.class, args);
		ctx.close();
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("---Empieza App---");
		
		Pedido p1=servicioPedido.crearPedido("PHONE HOUSE", "Calle Madrid/9", true);
		servicioPedido.annadirProducto(p1, "Xiaomi Redmi Note 8", 121.00);
		servicioPedido.annadirProducto(p1, "Xiaomi Redmi Note 9", 201.00);
		servicioPedido.calcularPVP(p1);
		System.out.println(p1);
		
		Pedido p2=servicioPedido.crearPedido("VODAFONE", "Calle Madrid/9", false);
		servicioPedido.annadirProducto(p2, "Xiaomi Redmi Note 11", 312.00);
		servicioPedido.annadirProducto(p2, "Xiaomi Redmi Note 6", 76.00);
		servicioPedido.calcularPVP(p2);
		System.out.println(p2);
		
		System.out.println("---Fin---");
		
	}

}
