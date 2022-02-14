package br.com.personal.financies.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Receita {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String descricao;
	private BigDecimal valor;
	private LocalDate data;
}
