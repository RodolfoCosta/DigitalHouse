package br.com.projetopizzaria.pizzariaDH.data.vo.v1;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.dozermapper.core.Mapping;

import lombok.Data;

@Data
@JsonPropertyOrder({ "ativo", "id", "sabor", "valor", "data" })
public class PedidoVO extends RepresentationModel<PedidoVO> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Mapping("id")
	@JsonProperty("id")
	private Long key;

	@JsonProperty("sabor")
	private String sabor;

	@JsonProperty("valor")
	private String valor;

	@JsonProperty("data")
	private String data;

	@JsonProperty("ativo")
	private Boolean ativo;

}
