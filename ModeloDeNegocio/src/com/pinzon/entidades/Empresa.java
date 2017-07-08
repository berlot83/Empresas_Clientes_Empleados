package com.pinzon.entidades;

public abstract class Empresa {

	String nombre;
	String cuit;
	String direccion;
	String telefono;
	
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getCuit() {
			return cuit;
		}
		public void setCuit(String cuit) {
			this.cuit = cuit;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
	
}
