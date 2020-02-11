package Biotren;

public class tarjeta {

	private String nombre;
	private int numtarj;
	private String tipo;
	private int saldo;
	private boolean desc;
	
	public tarjeta(String nombre,int numtarj, String tipo, int saldo, boolean desc) {
		
		this.numtarj = numtarj;
		this.tipo = tipo;
		this.saldo = saldo;
		this.desc = desc;
		this.nombre=nombre;
	}
	public tarjeta() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumtarj() {
		return numtarj;
	}
	public void setNumtarj(int numtarj) {
		this.numtarj = numtarj;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public boolean isDesc() {
		return desc;
	}
	public void setDesc(boolean desc) {
		this.desc = desc;
	}
	
	public void recarga(int recargasaldo) {
		setSaldo(saldo+recargasaldo);
		
	}
	public void descuento(int dsctsaldo) {
		setSaldo(saldo-dsctsaldo);
		
	}
	
	public void descuentoinac(boolean desc) {
		if (desc) {
			setSaldo(0);
		}
	}
	
	
	
}
