package br.com.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.model.entity.Estudante;
import br.com.model.repository.EstudanteRepository;


@Named("estudanteController")
@SessionScoped
public class EstudanteController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private EstudanteRepository repository;

	private Estudante estudante;

	public EstudanteController() {
	}

	@PostConstruct
	public void init() {
		estudante = new Estudante();
	}

	public List<Estudante> todosEstudantes() {
		return repository.todosEstudantes();
	}

	public String novoEstudante() {
		repository.novoEstudante(estudante);
		return "listar-estudantes-prime";
	}
	public String estudanteForm() {
		estudante = new Estudante();
		return "novoestudante-prime";
	}

	public String alterarEstudante() {
		repository.alterarEstudante(estudante);
		return "listar-estudantes-prime";
	}

	public void removerEstudante(int id) {
		repository.deletarEstudantePorId(id);
	}

	public String consultarEstudante(int id) {
		this.estudante = repository.acharEstudantePorId(id);
		return "atualizar-estudante-prime";
	}

	// getters & setters

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

}