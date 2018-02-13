package be.vdab.repositories;

import java.util.Optional;

import javax.persistence.EntityManager;

import be.vdab.entities.Docent;
import be.vdab.filters.JPAFilter;

public class DocentRepository {
	public Optional<Docent> read(long id, EntityManager entityManager) {
		return Optional.ofNullable(entityManager.find(Docent.class, id));
	}

	public void create(Docent docent, EntityManager entityManager) {
		entityManager.persist(docent);
	}
}