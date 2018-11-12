package managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entidades.Aluno;

@ManagedBean
@SessionScoped
public class AlunoMB {
	
	private Aluno aluno = new Aluno();
	private EntityManagerFactory emf;
	
	public AlunoMB() {
		emf = Persistence.createEntityManagerFactory("prjIntegradoGlauco");
	}
	
	public void salvar() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();
		em.close();
		aluno = new Aluno();
	}
	
	public List<Aluno> getAlunos(){
		List <Aluno> lista = null;
		EntityManager em = emf.createEntityManager();
		lista = em.createQuery("Select a From Aluno a").getResultList();
		System.out.println(lista.size());
		em.close();
		return lista;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Aluno getAluno(){
		return aluno;
	}
	
}