package managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entidades.Aluno;

@ManagedBean
@SessionScoped
public class AlunoMB {
	private List<Aluno> listaAlunos = new ArrayList<Aluno>();
	private Aluno aluno = new Aluno();
	
	public void salvar() {
		listaAlunos.add(aluno);
		aluno = new Aluno();
	}
	public List<Aluno> getAlunos(){
		return listaAlunos;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Aluno getAluno(){
		return aluno;
	}
	
}