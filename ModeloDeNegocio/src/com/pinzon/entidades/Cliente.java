package com.pinzon.entidades;
import java.util.ArrayList;

import com.pinzon.utilidades.InterfaceCliente;

public class Cliente extends Persona implements InterfaceCliente{

	// Implementa una interface y sobreescribe sus métodos.
	int numeroCliente;
	double precioPack;
	boolean estado;
	boolean reclamo;

	//Constructor
	public Cliente(String nomb, String apell, int nroCliente, double precioPack) {
		super(nomb, apell);
		this.numeroCliente = nroCliente;
		this.precioPack = precioPack;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public boolean isEstado() {
		return estado;
	}

	public boolean isReclamo() {
		return reclamo;
	}

	public void setReclamo(boolean reclamo) {
		this.reclamo = reclamo;
	}

	public double getPrecioPack() {
		return precioPack;
	}

	public void setPrecioPack(double precioPack) {
		this.precioPack = precioPack;
	}

	public double descuentoPack(double porcentaje) {
		double descuento = getPrecioPack() / porcentaje;

		return descuento;
	}

	//Sobreescritura de los métodos de la interface
	@Override
	public boolean estado(int nroCliente) {

		boolean estado = this.estado;

		try {
			if (estado == true)
				estado = true;
			else
				estado = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return estado;
	}

	@Override
	public boolean reclamo(int nroCliente) {

		boolean reclamo = false;

		try {
			if (reclamo == true)
				reclamo = true;
			else
				reclamo = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return reclamo;
	}

	@Override
	public ArrayList<Cliente> agregarEmpleado(ArrayList<Cliente> listado) {
		listado.add(new Cliente(getNombre(), getApellido(), getNumeroCliente(), getPrecioPack()));
		return listado;
	}

	@Override
	public boolean contratar(int numeroCliente) {
		boolean contratado = false;
		
		try{
			if(this.getNumeroCliente()>10){
				contratado = true;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			contratado = false;
		}
		
		
		return contratado;
	}	

}
