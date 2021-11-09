package it.ntt.hellospringboot.repository;

import org.springframework.data.repository.CrudRepository;

import it.ntt.hellospringboot.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
