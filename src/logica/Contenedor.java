package logica;

public class Contenedor {
	private int idContenedor;
	private int capacidad;
	private boolean disponibilidad;
	public Contenedor(int idContenedor, int capacidad, boolean disponibilidad) {
		super();
		this.idContenedor = idContenedor;
		this.capacidad = capacidad;
		this.disponibilidad = disponibilidad;
	}
	@Override
	public String toString() {
		return "Contenedor [idContenedor=" + idContenedor + ", capacidad=" + capacidad + ", disponibilidad="
				+ disponibilidad + "]";
	}
	public int getIdContenedor() {
		return idContenedor;
	}
	public void setIdContenedor(int idContenedor) {
		this.idContenedor = idContenedor;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
}
