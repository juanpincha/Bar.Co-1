package logica;

public class Encargado extends Persona{
	private int idEncargado;

	public Encargado(String nombre, String apellido, String mail, String clave, int idEncargado) {
		super(nombre, apellido, mail, clave);
		this.idEncargado = idEncargado;
	}

	@Override
	public String toString() {
		return "Encargado [idEncargado=" + idEncargado + "]";
	}

	public int getIdEncargado() {
		return idEncargado;
	}

	public void setIdEncargado(int idEncargado) {
		this.idEncargado = idEncargado;
	}

}
