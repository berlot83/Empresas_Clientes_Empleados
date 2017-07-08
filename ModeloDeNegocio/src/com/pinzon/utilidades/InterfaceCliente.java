package com.pinzon.utilidades;
import java.util.ArrayList;
import com.pinzon.entidades.Cliente;

public interface InterfaceCliente {
	
	ArrayList<Cliente> agregarEmpleado(ArrayList<Cliente> listado);
	
	boolean estado(int nroCliente);

	boolean reclamo(int nroCliente);

}





