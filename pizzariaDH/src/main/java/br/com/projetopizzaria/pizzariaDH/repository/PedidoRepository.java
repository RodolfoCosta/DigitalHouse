package br.com.projetopizzaria.pizzariaDH.repository;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.projetopizzaria.pizzariaDH.data.entity.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	@Query("SELECT u FROM Pedido u WHERE u.idPedido =:idPedido")
	User findByIdPedido(@Param("idPedido") int idPedido);

	void inativarPedido(Long id);

}
