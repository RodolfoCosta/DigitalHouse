package br.com.projetopizzaria.pizzariaDH.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pedidos")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length = 100)
	private Sabor sabor;

	@Column(nullable = false, length = 100)
	private BigDecimal valor;

	@Column(nullable = false, length = 100)
	private LocalDate date;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "item_pedido", joinColumns = { @JoinColumn(name = "id_pedido") }, inverseJoinColumns = {
			@JoinColumn(name = "id_pizza") })
	private List<ItensPedido> itensPedido;

}
