package logica;

public class Cliente extends Persona {
	
	private int idCliente;

	public Cliente(String nombre, String apellido, String mail, String clave, int idCliente) {
		super(nombre, apellido, mail, clave);
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + "]";
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

}
