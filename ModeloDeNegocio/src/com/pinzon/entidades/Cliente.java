package com.pinzon.entidades;
import java.util.ArrayList;

import com.pinzon.utilidades.InterfaceCliente;

public class Cliente extends Persona implements InterfaceCliente{

	int numeroCliente=0;
	boolean estado;
	boolean reclamo;
	
	public Cliente(String nomb, String apell, int nroCliente) {
		super(nomb, apell);
		this.numeroCliente= nroCliente++;
	}
	
		public int getNumeroCliente() {
			return numeroCliente;
		}
	
		public void setNumeroCliente(int numeroCliente) {
			this.numeroCliente = numeroCliente;
		}
		
		public void setEstado(boolean estado){
			this.estado=estado;
		}
		
		public boolean isEstado(){
			return estado;
		}
		
		public boolean isReclamo() {
			return reclamo;
		}

		public void setReclamo(boolean reclamo) {
			this.reclamo = reclamo;
		}

		
		@Override
		public boolean estado(int nroCliente) {
		
			boolean estado= this.estado;
			
			try{
				if(estado == true)
					estado= true;
				else
					estado= false;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return estado;
		}

		@Override
		public boolean reclamo(int nroCliente) {
			
			boolean reclamo= false;
			
			try{
				if(reclamo == true)
					reclamo= true;
				else
					reclamo= false;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return reclamo;
		}

		@Override
		public ArrayList<Cliente> agregarEmpleado(ArrayList<Cliente> listado){
			listado.add(new Cliente(getNombre(), getApellido(), getNumeroCliente()));
		return listado;
		}
}
