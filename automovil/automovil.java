package automovil;

public class automovil {

	private String marca;
	private String modelo;
	private int a�o;
	private double precio;
	public automovil(String marca, String modelo, int a�o, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void preciofinal(int precio) {
		setPrecio(this.precio+(this.precio*0.19)+(this.precio*0.05)+100000);
	}
}
