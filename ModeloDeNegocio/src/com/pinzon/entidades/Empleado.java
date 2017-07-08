package com.pinzon.entidades;

import java.util.ArrayList;

import com.pinzon.utilidades.InterfaceEmpleado;

public class Empleado extends Persona implements InterfaceEmpleado{

	int numeroDeEmpleado;
	boolean estado;
	
	//Constructor, el nro de empleado se usa para identificar el objeto.
	public Empleado(String nomb, String apell, int nroEmpleado, boolean estado) {
		super(nomb, apell);
		this.numeroDeEmpleado= nroEmpleado;
		this.estado= estado;
	}

		public int getNumeroDeEmpleado() {
			return numeroDeEmpleado;
		}
	
	
		public void setNumeroDeEmpleado(int numeroDeEmpleado) {
			this.numeroDeEmpleado = numeroDeEmpleado;
		}
	
	
		public boolean isEstado() {
			return estado;
		}
	
	
		public void setEstado(boolean estado) {
			this.estado = estado;
		}

		//Sobreescritura de métodos de la interface.
		@Override
		public void tomarEmpleado(ArrayList<Empleado> listado) {
			listado.add(new Empleado(getNombre(),getApellido(), getNumeroDeEmpleado(),isEstado()));
		}

		@Override
		boolean contratar(int numeroEmpleado) {
			// TODO Auto-generated method stub
			return true;
		}
	
}
