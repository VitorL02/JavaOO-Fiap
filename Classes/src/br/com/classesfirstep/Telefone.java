package br.com.classesfirstep;

public class Telefone {
	private String ddd;
	private String telefone;
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	
	private String getTelefoneFormatado(){
		return formatarTelefone(ddd,telefone);
	}
	
	private String formatarTelefone(String ddd, String telefone) {
		return "(" + ddd + ")" + telefone ;
	}
	
}
