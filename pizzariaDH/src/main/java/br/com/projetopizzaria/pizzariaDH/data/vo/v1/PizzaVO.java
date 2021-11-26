package br.com.projetopizzaria.pizzariaDH.data.vo.v1;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.dozermapper.core.Mapping;

import lombok.Data;

@Data
@JsonPropertyOrder({ "ativo", "id", "sabor", "tamanho" })
public class PizzaVO extends RepresentationModel<PizzaVO> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Mapping("id")
	@JsonProperty("id")
	private Long key;

	@JsonProperty("sabor")
	private String sabor;

	@JsonProperty("tamanho")
	private String tamanho;

	@JsonProperty("ativo")
	private Boolean ativo;

}
