package br.com.cpim.rest;

/** 
 * @author Marcos Augusto Modesto
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("calcular")
public class Calcular {

	@GET
	@Path("soma/{a}/{b}")
	public String adicao(@PathParam("a") int a, @PathParam("b") int b) {
		return new Calculo(a, b, 'a').toString();
	}

	@GET
	@Path("subtracao/{a}/{b}")
	public String subtracao(@PathParam("a") int a, @PathParam("b") int b) {
		return new Calculo(a, b, 's').toString();
	}
	
	@GET
	@Path("multiplicacao/{a}/{b}")
	public String multiplicacao(@PathParam("a") int a, @PathParam("b") int b) {
		return new Calculo(a, b, 'm').toString();
	}
	@GET
	@Path("divisao/{a}/{b}")
	public String divisao(@PathParam("a") int a, @PathParam("b") int b) {
		return new Calculo(a, b, 'd').toString();
	}
}