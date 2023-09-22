package logica;

public class Capitan extends Persona {
	private int idCapitan;

	public Capitan(String nombre, String apellido, String mail, String clave, int idCapitan) {
		super(nombre, apellido, mail, clave);
		this.idCapitan = idCapitan;
	}

	@Override
	public String toString() {
		return "Capitan [idCapitan=" + idCapitan + "]";
	}

	public int getIdCapitan() {
		return idCapitan;
	}

	public void setIdCapitan(int idCapitan) {
		this.idCapitan = idCapitan;
	}
	
}
