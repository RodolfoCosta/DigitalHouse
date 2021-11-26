package br.com.projetopizzaria.pizzariaDH.repository;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.projetopizzaria.pizzariaDH.data.entity.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {

	@Query("SELECT u FROM Pedido u WHERE u.idPedido =:idPedido")
	User findByIdPedido(@Param("idPedido") String idPedido);

	@Query("SELECT u FROM Pedido u WHERE u.saborPizza =:saborPizza")
	User findBySabor(@Param("saborPizza") String saborPizza);

}
