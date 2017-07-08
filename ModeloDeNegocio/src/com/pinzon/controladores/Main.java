package com.pinzon.controladores;
import java.util.ArrayList;
import com.pinzon.entidades.Cliente;
import com.pinzon.entidades.Empleado;
import com.pinzon.entidades.Utilidades;


public class Main {

	public static void main(String[] args) {
	
		Cliente c0= new Cliente("Mariano","Moreno",1);
		Cliente c1= new Cliente("Paco","Miranda",2);
		Cliente c2= new Cliente("Lola","Miranda",3);
		Cliente c3= new Cliente("Sara","Miranda",4);
		Cliente c4= new Cliente("Lucas","Fernandez",5);
		Cliente c5= new Cliente("Bernarda","Moreno",6);
		Cliente c6= new Cliente("Quique","fernandez",7);
	
		ArrayList<Cliente> al= new ArrayList<>();
		al.add(c0);
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
		al.add(c6);

		System.out.println("Estado: ");
				Utilidades.setearEstado(al, true);
				Utilidades.consultaEstado(al);
				
		System.out.println("Reclamos:");
				Utilidades.setearReclamo(al, false);
				Utilidades.consultaReclamo(al, false);
		
		System.out.println("Pruebas:");
				System.out.println("El estado del cliente es: "+c3.estado(c3.getNumeroCliente()));
				
				System.out.println("El reclamo del cliente es: "+c3.reclamo(c3.getNumeroCliente()));
				
		System.out.println("");
			for(Cliente resultado : al)
				System.out.println("numero de Cliente: "+ resultado.getNumeroCliente());
			
		System.out.println("Empleados: ");
			
		ArrayList<Empleado> al1= new ArrayList<>();
			Empleado e1= new Empleado("Axel", "Berlot", 1, false);
			Empleado e2= new Empleado("Alexis", "Berlot", 2, false);
			Empleado e3= new Empleado("Marcelo", "Lopez", 3, true);
			
				al1.add(e1);
				al1.add(e2);
				al1.add(e3);
				for(Empleado resultado : al1)
					System.out.println(al.get(resultado.getNumeroDeEmpleado()).getNombre());
				
				System.out.println("For Clásico: ");
				
				for(int i=0;i<al1.size();i++)
					System.out.println(al1.get(i).getApellido()+ ", "+al1.get(i).getNombre());
				
	}

}
