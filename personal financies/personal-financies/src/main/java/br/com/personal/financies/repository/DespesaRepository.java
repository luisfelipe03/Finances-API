package br.com.personal.financies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.personal.financies.model.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, Integer> {

}
