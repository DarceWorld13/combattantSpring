package fr.combattant.app;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CombattantRepo extends JpaRepository<Combattant, String>{

	List<Combattant> trouverParNom(String nameToFind);
	
	

}
