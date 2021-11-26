package br.com.projetopizzaria.pizzariaDH.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pizzas")
public class Pizza implements Serializable, TamanhoPizza {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@Column(nullable = false, length = 100)
	private Sabor sabor;

	@Column(nullable = false, length = 100)
	private BigDecimal valor;

	@Override
	public String tamanho(String t) {
		return t;
	}

}
