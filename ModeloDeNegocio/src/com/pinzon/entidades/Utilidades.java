package com.pinzon.entidades;

import java.util.ArrayList;

public class Utilidades {
	
	/* Esta clase tiene varios métodos static para ser ingresados directamente
	 * desde la clase, el ArrayList<> de parámetro puede ser creado en la clase
	 * donde es llamada esta interface.
	 * El recorrido de los ArrayList<> está hecho con for avanzado sólo para
	 * hacer más rápido el código, el getNumeroDeCliente()-1, es porque si no se
	 * le coloca el mismo la JVM tira indexOutOfBoundsException, porque las
	 * posiciones se empiezan a contar desde el "0" y el getNumeroDeCLiente()
	 * arranca desde el 1. 
	 */ 
	
	public static void setearReclamo(ArrayList<Cliente> al, boolean reclamo){
		for(Cliente resultado : al)
			al.get(resultado.getNumeroCliente()-1).setReclamo(reclamo);
	}
	
	public static void consultaReclamo(ArrayList<Cliente> al, boolean reclamo){
		for(Cliente resultado : al)
			System.out.println("El reclamo del cliente "+resultado.getApellido()+ " es: "+ resultado.isReclamo());
	}

	public static void setearEstado(ArrayList<Cliente> al, boolean estado){
		for(Cliente resultado : al)
			al.get(resultado.getNumeroCliente()-1).setEstado(estado);
	}
	
	public static void consultaEstado(ArrayList<Cliente> al){
		for(Cliente resultado : al)
			System.out.println("El estado del cliente "+resultado.getApellido()+ " es: "+ resultado.isEstado());
	}
}
