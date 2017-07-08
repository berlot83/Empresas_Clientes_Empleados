package com.pinzon.controladores;
import java.util.ArrayList;

import com.pinzon.entidades.Cliente;
import com.pinzon.entidades.Empleado;
import com.pinzon.entidades.Utilidades;


public class Main {

	public static void main(String[] args) {
	
		/* Vamos a jugar un poco con lo que tenemos
		 * Acá estamos creando una lista de clientes nuevos
		 * los cuales tienen un contructor con nombre apellido
		 * número de cliente y precio del pack.		 * 
		 */
		
		Cliente c0= new Cliente("Mariano","Moreno",1, 123456);
		Cliente c1= new Cliente("Paco","Miranda",2, 12345);
		Cliente c2= new Cliente("Lola","Miranda",3, 345346);
		Cliente c3= new Cliente("Sara","Miranda",4, 34535);
		Cliente c4= new Cliente("Lucas","Fernandez",5, 345345);
		Cliente c5= new Cliente("Bernarda","Moreno",6, 3453455);
		Cliente c6= new Cliente("Quique","fernandez",7, 321324);
		Cliente c7= new Cliente("Bernarda","Moreno",8, 3453455);
		Cliente c8= new Cliente("Quique","fernandez",9, 321324);
		Cliente c9= new Cliente("José","Povedilla",10, 159655);
		Cliente c10= new Cliente("Don","Lorenzo",11, 321324);
		Cliente c11= new Cliente("Luis","Marquez",12, 3453455);
		Cliente c12= new Cliente("Silvia","Lorenzo",13, 321324);
		
		/* Agregamos los clientes a un ArrayList<>*/
		
		ArrayList<Cliente> al= new ArrayList<>();
		al.add(c0);
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
		al.add(c6);
		al.add(c7);
		al.add(c8);
		al.add(c9);
		al.add(c10);
		al.add(c11);
		al.add(c12);
		
		/* Recorremos el ArrayList<> tomamos el nombre y usamos
		 * un método abstracto de la clase Cliente que devuelve
		 * un booleano.
		 */
		
		for(int i=0; i<=al.size()-1;i++)
		System.out.println("El cliente "+al.get(i).getNombre()+", está en estado de contrato: "+ al.get(i).contratar(i));
	
		
		/*Utilizamos un método estático que recorre el ArrayList
		 * desde el inicio hasta el final y no en reversa, no se
		 * puede acceder en forma random ni a un Arra
		 * 
		 * El primer método setea y el segundo consulta.
		 */
		System.out.println("");
		System.out.println("Estado: ");
				Utilidades.setearEstado(al, true);
				Utilidades.consultaEstado(al);
				
		/*Utilizamos un método estático que recorre el ArrayList
		* desde el inicio hasta el final y no en reversa, no se
		* puede acceder en forma random ni a un Arra
		* 
		* El primer método setea y el segundo consulta.
		*/
		System.out.println("");
		System.out.println("Reclamos:");
				Utilidades.setearReclamo(al, false);
				Utilidades.consultaReclamo(al, false);
		
				
		/* En este caso sólo consultamos el estado en un método
		 * no estático.
		 * También usamos un método no estático para consultar
		 * el reclamo, son métodos definidos en el Archivo cliente
		 * que están sobreescritos de la interface
		 * 
		 * No hay recorrido alguno, sólo se accede por el objeto.
		 */
		System.out.println("");
		System.out.println("Pruebas:");
				System.out.println("El estado del cliente es: "+c3.estado(c3.getNumeroCliente()));
				
				System.out.println("El reclamo del cliente es: "+c3.reclamo(c3.getNumeroCliente()));
				
		/* Recorremos el ArrayList<> imprimimos el número de cliente
		 * y el precio por pack elegido, que es un atributo de la clase
		 * cliente.
		 */
		System.out.println("");
			for(Cliente resultado : al)
				System.out.println("numero de Cliente: "+ resultado.getNumeroCliente()+", el precio del pack es: "+ resultado.getPrecioPack());
			
		/* Creamos un ArrayList<> de la Clase empleados y le agregamos todas
		 * las instancias creadas.
		 */
		System.out.println("");
		System.out.println("Empleados: ");

		ArrayList<Empleado> al1 = new ArrayList<>();
		Empleado e1 = new Empleado("Axel", "Berlot", 1, false);
		Empleado e2 = new Empleado("Alexis", "Berlot", 2, false);
		Empleado e3 = new Empleado("Marcelo", "Lopez", 3, true);

		al1.add(e1);
		al1.add(e2);
		al1.add(e3);
		
		/* Recorremos el ArrayLis<> con un for avanzado de principio a fin*/
		for (Empleado resultado : al1)
			System.out.println(al.get(resultado.getNumeroDeEmpleado()).getNombre());
		
		/* Recorremos el ArrayList<> anterior de la clase Empleados por medio
		 * de un for básico, el cual nos permite tener un random access a los
		 * objetos o recorrido inverso del mismo.
		 * 
		 * Si el límite de tamaño del ArrayList o Array no está definido es posible
		 * que entre en una loop infinita.
		 */
		System.out.println("");
		System.out.println("For Clásico: ");

		for (int i = 0; i < al1.size(); i++)
			System.out.println(al1.get(i).getApellido() + ", " + al1.get(i).getNombre());		
	}

}
