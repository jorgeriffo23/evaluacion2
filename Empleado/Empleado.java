package Empleado;

public class Empleado {

	private int rut;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String cargo;
	private String direccion;
	private int fono;
	private String email;
	
	
	
	public Empleado(int rut, String apellido1, String apellido2, String direccion, int fono, String email) {
		super();
		this.rut = rut;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.fono = fono;
		this.email = email;
	}



	public Empleado(int rut, String nombre, String apellido1, String apellido2, String cargo) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.cargo = cargo;
	}
	
}
