package br.com.personal.financies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.personal.financies.model.Receita;

public interface ReceitaRepository extends JpaRepository<Receita, Integer> {

}
