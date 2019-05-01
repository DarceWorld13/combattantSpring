package fr.combattant.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CombattantService {

	CombattantRepo pRepo;

	//on génère des getters et des setters pour notre pRepo; 
	public CombattantRepo getpRepo() {
		return pRepo;
	}

	public void setpRepo(CombattantRepo pRepo) {
		this.pRepo = pRepo;
	}

	//contructeur 
	@Autowired
	public CombattantService(CombattantRepo pRepo) {
		super();
		this.pRepo = pRepo;
	} 
	
	//nos méthodes : 
	
	public List<Combattant> findByName(String nameToFind) {
		
		List<Combattant> listeDeCombattant = pRepo.trouverParNom(nameToFind);
		
		return listeDeCombattant;
			
	}
	
	
	
	
	
	
	
	
}
