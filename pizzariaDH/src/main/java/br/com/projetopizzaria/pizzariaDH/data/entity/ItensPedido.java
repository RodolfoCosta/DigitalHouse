package br.com.projetopizzaria.pizzariaDH.data.entity;

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
@Table(name = "itenspedido")
public class ItensPedido {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	@Column(nullable = false, length = 100)
	private Pedido pedido;

	@ManyToOne
	@Column(nullable = false, length = 100)
	private Pizza pizza;


	@Column(nullable = false, length = 100)
	private BigDecimal valor;

	@Column(nullable = false, length = 100)
	private String observacoes;

}
