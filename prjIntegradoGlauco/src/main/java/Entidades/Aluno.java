package Entidades;

public class Aluno {
	private int RA;
	private int faltas;
	private String nome;
	private double nota;
	
	public int getRA() {
		return RA;
	}
	public void setRA(int ra) {
		this.RA = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
}