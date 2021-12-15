package br.com.model.repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.model.entity.Estudante;


@Stateless
public class EstudanteRepository {

	@PersistenceContext
	private EntityManager em;

	public void novoEstudante(Estudante estudante) {
		em.persist(estudante);
	}

	public List<Estudante> todosEstudantes() {
		return em.createQuery("Select e from Estudante e order by id", Estudante.class).getResultList();
	}

	public Estudante acharEstudantePorId(int id) {
		return em.find(Estudante.class, id);
	}

	public void deletarEstudantePorId(int id) {
		em.remove(em.find(Estudante.class, id));
	}

	public void alterarEstudante(Estudante estudante) {
		em.merge(estudante);
	}

}
