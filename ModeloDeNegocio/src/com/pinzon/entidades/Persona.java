package com.pinzon.entidades;

public abstract class Persona {
	
	String nombre;
	String apellido;
	boolean sexo;
	String telefono;
	String direccion;
	
	Persona(String nomb, String apell){
		this.nombre= nomb;
		this.apellido=apell;
	}
	
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public boolean isSexo() {
			return sexo;
		}
		public void setSexo(boolean sexo) {
			this.sexo = sexo;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

}
