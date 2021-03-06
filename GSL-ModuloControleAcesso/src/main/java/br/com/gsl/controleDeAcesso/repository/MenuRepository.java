package br.com.gsl.controleDeAcesso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.gsl.controleDeAcesso.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {

		@Query(value = "SELECT * FROM menu WHERE permission_id =:permission", nativeQuery = true)
		List<Menu> findByMenuPermission(@Param("permission") Integer permission);
}
