package qualquer_um.crime.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import qualquer_um.crime.model.Model;


public interface Repository extends JpaRepository<Model, Long>{
	
	

}
