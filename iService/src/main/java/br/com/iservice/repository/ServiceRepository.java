package br.com.iservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.iservice.model.Serviço;

	@Repository
	public interface ServiceRepository extends JpaRepository<Serviço, Long>{
		
	}