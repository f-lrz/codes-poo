package entidades;

import java.time.LocalDate;

public class Telemarketing {
	private int ID;
	private LocalDate datadalig;
	private String atendente;
	private Cliente c;
	
	public Telemarketing(int iD, LocalDate datadalig, String atendente, String nomecliente, int CPFcliente) {
		super();
		ID = iD;
		this.datadalig = datadalig;
		this.atendente = atendente;
		c = new Cliente(nomecliente, CPFcliente);
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public LocalDate getDatadalig() {
		return datadalig;
	}
	public void setDatadalig(LocalDate datadalig) {
		this.datadalig = datadalig;
	}
	public String getAtendente() {
		return atendente;
	}
	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}
	public Cliente getC() {
		return c;
	}
	public void setC(Cliente c) {
		this.c = c;
	}
	
	
}
