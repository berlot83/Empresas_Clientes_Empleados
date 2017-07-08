package com.pinzon.entidades;

import java.util.ArrayList;

public class Utilidades {
		
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
