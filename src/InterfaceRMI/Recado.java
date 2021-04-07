package InterfaceRMI;

import java.io.Serializable;

public class Recado implements Serializable{

	private static final long serialVersionUID = -5416703051851140809L;
	private int Codigo;
	private String texto;
	private String apelido;
	
	
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
		

}
