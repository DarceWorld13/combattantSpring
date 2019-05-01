package fr.combattant.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.combattant.app.entity.Combattant;
import fr.combattant.app.service.CombattantService;

@RestController
@RequestMapping("/combattant")
public class CombattantController {
	
	@Autowired
	private CombattantService fighterService; 
	
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Integer> trouverParNom(@RequestParam("name") String nomSaisiDansRequete){
		
		List<Integer> listeIDtrouver = new ArrayList<>();
		
		List<Combattant> combattantListes = fighterService.findByName(nomSaisiDansRequete); 
		
		for (Combattant combattant : combattantListes) {
			
			listeIDtrouver.add(combattant.getId());
		}
		
		
		return listeIDtrouver;
		
	}
	
	
	   @RequestMapping( method = RequestMethod.POST)
	    public Combattant create(@RequestBody Combattant fighter) {
		   Combattant nouveau = fighterService.createFighter(fighter);
	    	return nouveau; 
	    }
	
	
	
	
	
	

}
