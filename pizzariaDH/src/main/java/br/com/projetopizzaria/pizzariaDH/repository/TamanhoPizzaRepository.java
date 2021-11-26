package br.com.projetopizzaria.pizzariaDH.repository;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.projetopizzaria.pizzariaDH.data.entity.TamanhoPizza;

@Repository
public interface TamanhoPizzaRepository extends JpaRepository<TamanhoPizza, Long> {

	@Query("SELECT u FROM TamanhoPizza u WHERE u.tamanhoPizza =:tamanhoPizza")
	User findByTamanhoPizza(@Param("tamanhoPizza") String tamanhoPizza);

}
