package fr.combattant.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.combattant.app.entity.Combattant;
import fr.combattant.app.repository.CombattantRepo;

@Service
public class CombattantService {
	
	
	@Autowired
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
		
		List<Combattant> listeDeCombattant = pRepo.findAll();
		
		return listeDeCombattant;
			
	}
	
	public Combattant createFighter(Combattant fighter) {
		
		pRepo.save(fighter);
		
		return fighter;
		
	}
	
	
	
	
	
	
	
	
}
