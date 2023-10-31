package br.com.erudio.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erudio.model.Person;

public interface PersonRepositories extends JpaRepository<Person, Long>{}
