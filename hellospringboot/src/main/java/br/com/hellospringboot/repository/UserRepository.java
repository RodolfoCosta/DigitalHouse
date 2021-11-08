package br.com.hellospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hellospringboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	
}
