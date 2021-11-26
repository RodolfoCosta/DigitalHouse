package br.com.projetopizzaria.pizzariaDH.repository;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.projetopizzaria.pizzariaDH.data.entity.Sabor;

@Repository
public interface SaborRepository extends JpaRepository<Sabor, Long> {

	@Query("SELECT u FROM Sabor u WHERE u.sabor =:sabor")
	User findBySabor(@Param("sabor") String sabor);

}
