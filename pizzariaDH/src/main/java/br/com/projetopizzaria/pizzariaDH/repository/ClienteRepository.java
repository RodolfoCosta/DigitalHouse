package br.com.projetopizzaria.pizzariaDH.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.projetopizzaria.pizzariaDH.data.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	@Modifying
	@Query("UPDATE Cliente p SET p.ativo = false WHERE p.id =:id")
	void inativarCliente(@Param("id") Long id);

	@Query("SELECT p FROM Cliente p WHERE p.nome LIKE LOWER(CONCAT ('%', :nome ,'%'))")
	List<Cliente> buscarClientePorNome(@Param("nome") String nome);

}
