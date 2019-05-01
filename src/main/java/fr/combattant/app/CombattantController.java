package fr.combattant.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/combattant")
public class CombattantController {
	
	@Autowired
	private CombattantService fighterService; 
	
	public List<Integer> trouverParNom(@RequestParam("name") String nomSaisiDansRequete){
		
		
		List<Integer> listeIDtrouver = new ArrayList<>();
		
		List<Combattant> combattantListes = fighterService.findByName(nomSaisiDansRequete); 
		
		for (Combattant combattant : combattantListes) {
			
			listeIDtrouver.add(combattant.getId());
		}
		
		
		return listeIDtrouver;
		
		
	}
	
	

}
